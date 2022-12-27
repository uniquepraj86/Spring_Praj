package com.praj.spring.onetoone.repository;

import com.praj.spring.onetoone.entity.Aadhar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AadharRepository extends JpaRepository<Aadhar,Integer> {
}
