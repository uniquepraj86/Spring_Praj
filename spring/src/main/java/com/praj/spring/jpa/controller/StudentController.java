package com.praj.spring.jpa.controller;


import com.praj.spring.jpa.entity.Student;
import com.praj.spring.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("saveStudent")
    public String saveStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "student saved..";
    }


    @GetMapping("getStudent")
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    @GetMapping("getById/{id}")
    public Student getStudentById(@PathVariable Integer id){
      return  studentRepository.getReferenceById(id);

    }

    @PostMapping("saveStudents")
    public String saveStudent(@RequestBody List<Student> students){
        studentRepository.saveAll(students);
        return "students saved..";
    }

    @PutMapping("update")
    public String updateStudent(@RequestBody Student student){
        Student student1= studentRepository.getReferenceById(student.getId());
        student1.setAddress(student.getAddress());
        student1.setName(student.getName());

        studentRepository.save(student1);
        return "record Updated";
    }
//    @DeleteMapping("delete/{id}")
//    public String deleteStudent(@PathVariable("id") Integer id){
//        studentRepository.deleteById(id);
//        return "Record Delete";
//
//    }
    @DeleteMapping("deleteIds/{id}")
    public String deleteStudent(@PathVariable("id") List<Integer> id){
        studentRepository.deleteAllById(id);
        return "Record Delete";

    }


}
