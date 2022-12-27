package com.praj.spring.onetoone.repository;

import com.praj.spring.onetoone.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {

}
