package com.sen.Service;

import com.sen.Entity.CenterDetails;
import com.sen.Exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CenterService {

    //creat
    CenterDetails creatCenteres(CenterDetails centerDetails);

    //read
    CenterDetails readCenterById(Integer centerId)throws ResourceNotFoundException;

    //readAll
    List<CenterDetails> readAllCenteres();

    // update
    CenterDetails updateCenteres(Integer centerId, CenterDetails centerDetails)throws  ResourceNotFoundException;

    //delete
    void removeCenterById(Integer centerId)throws  ResourceNotFoundException;
}
