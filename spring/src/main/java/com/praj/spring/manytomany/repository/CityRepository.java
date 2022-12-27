package com.praj.spring.manytomany.repository;

import com.praj.spring.manytomany.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {

}
