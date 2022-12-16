package com.praj.spring.jpa.repository;

//import com.praj.spring.di.Student;
import com.praj.spring.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
