package com.praj.spring.onetomany.repository;

import com.praj.spring.onetomany.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {

}
