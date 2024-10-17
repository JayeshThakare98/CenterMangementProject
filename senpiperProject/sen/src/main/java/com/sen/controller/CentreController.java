package com.sen.controller;

import com.sen.Entity.CenterDetails;
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
    public  ResponseEntity<List<CenterDetails>> fetchAllcenters()
}
