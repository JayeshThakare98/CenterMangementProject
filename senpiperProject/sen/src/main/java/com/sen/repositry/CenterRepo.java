package com.sen.repositry;

import com.sen.Entity.CenterDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CenterRepo extends JpaRepository<CenterDetails,Integer> {

    Optional<CenterDetails> findByCenterName(String centerName);

}
