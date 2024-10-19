package com.sen.controller;

import com.sen.Entity.CenterDetails;
import com.sen.Exception.ApiResponse;
import com.sen.Exception.ResourceNotFoundException;
import com.sen.Service.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/center")
public class CentreController {
    @Autowired
    private CenterService centerService ;


    @PostMapping("/postcenter")
    public ResponseEntity<CenterDetails> generateCenter (@RequestBody CenterDetails centerDetails){
        CenterDetails centerDetails1 = centerService.creatCenteres(centerDetails);
        return new ResponseEntity<>(centerDetails1 , HttpStatus.CREATED);
    }

    @GetMapping("/getallcenters")
    public ResponseEntity<List<CenterDetails>> fetchAllcenters(){
        List<CenterDetails> centerDetails = centerService.readAllCenteres();
        return new ResponseEntity<>(centerDetails , HttpStatus.FOUND);
    }
    @GetMapping("/getsenbyid/{centerId}")
    public ResponseEntity<CenterDetails> fetchCenterbyId(@PathVariable Integer centerId) throws ResourceNotFoundException {
        CenterDetails cenDetById = centerService.readCenterById(centerId);
        return new ResponseEntity<>(cenDetById , HttpStatus.FOUND);

    }
    @PutMapping("/updateById/{centerId}")
    public  ResponseEntity<CenterDetails> updateById(@PathVariable Integer centerId , @RequestBody CenterDetails centerDetails) throws ResourceNotFoundException {
        CenterDetails centerDetailsupdate = centerService.updateCenteres(centerId, centerDetails);
        return new ResponseEntity<>(centerDetailsupdate , HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/removeById/{centerId}")
    public  ResponseEntity<ApiResponse> removecenter(@PathVariable Integer centerId){
        try {
            centerService.removeCenterById(centerId);
        } catch (ResourceNotFoundException e) {
            throw new RuntimeException(e);
        }
        return  new ResponseEntity<>(new ApiResponse("User deleted Successfully",true),HttpStatus.OK);
    }
}
