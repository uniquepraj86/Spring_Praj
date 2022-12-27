package com.praj.spring.manytomany.repository;

import com.praj.spring.manytomany.entity.PinCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PinCodeRepository extends JpaRepository<PinCode,Long> {
}
