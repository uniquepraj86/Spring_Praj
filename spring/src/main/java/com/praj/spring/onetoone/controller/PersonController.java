package com.praj.spring.onetoone.controller;

import com.praj.spring.onetoone.entity.Aadhar;
import com.praj.spring.onetoone.entity.Person;
import com.praj.spring.onetoone.repository.AadharRepository;
import com.praj.spring.onetoone.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private AadharRepository aadharRepository;


    @PostMapping("savePerson")
    public String savePerson(@RequestBody Person person) {
        personRepository.save(person);
        return "person saved..";
    }
    @PostMapping("saveAadhar")
    public String saveAadhar(@RequestBody Aadhar aadhar) {
        aadharRepository.save(aadhar);
        return "aadhar saved..";
    }


}
