package com.praj.spring.onetomany.controller;

import com.praj.spring.onetomany.entity.Vehicle;
import com.praj.spring.onetomany.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @Autowired
    private VehicleRepository vehicleRepository;


    @PostMapping("saveVehicle")
    public String saveVehicle(@RequestBody Vehicle vehicle){
        vehicleRepository.save(vehicle);
        return "saved..";
    }
}
