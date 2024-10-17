package com.sen.ServiceImpl;

import com.sen.Entity.CenterDetails;
import com.sen.Exception.ResourceNotFoundException;
import com.sen.Service.CenterService;
import com.sen.repositry.CenterRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CenterServiceImpl implements CenterService {

    @Autowired
    private CenterRepo centerRepo;

    @Override
    public CenterDetails creatCenteres(CenterDetails centerDetails) {
        Optional<CenterDetails> existingCenter = centerRepo.findByCenterName(centerDetails.getCenterName());
        if (existingCenter.isPresent()) {
            try {
                throw new ResourceNotFoundException("Centere with " + centerDetails.getCenterName() + "is already exist try the to insert another name");
            } catch (ResourceNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return centerRepo.save(centerDetails);
    }

    @Override
    public CenterDetails readCenterById(Integer centerId) throws ResourceNotFoundException {

        CenterDetails centerDetails = centerRepo.findById(centerId).orElseThrow(() -> new ResourceNotFoundException("center id " + centerId + "Is not present in data base "));

        return centerDetails;
    }

    @Override
    public List<CenterDetails> readAllCenteres() {
        List<CenterDetails> centerDetailsList = centerRepo.findAll();
        return centerDetailsList;
    }

    @Override
    public CenterDetails updateCenteres(Integer centerId, CenterDetails centerDetails) throws ResourceNotFoundException {

        CenterDetails centerDetails1 = centerRepo.findById(centerId).orElseThrow(() -> new ResourceNotFoundException("center id " + centerId + "Is not present in data base "));
        CenterDetails saveCenter = centerRepo.save(centerDetails1);
        return saveCenter;
    }

    @Override
    public void removeCenterById(Integer centerId) throws ResourceNotFoundException {
        CenterDetails centerDetails1 = centerRepo.findById(centerId).orElseThrow(() -> new ResourceNotFoundException("center id " + centerId + "Is not present in data base "));
        centerRepo.delete(centerDetails1);
    }
}
