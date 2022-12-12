package com.praj.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

@Autowired
   private Employee employee;

//    public Company(Employee employee) {
//        this.employee = employee;                    Constructor
//    }


//    public void setEmployee(Employee employee) {              //setter
//        this.employee = employee;
//    }

    @Autowired
    private Employee employee1;

    public void showCompanyEmp(){
        employee.empShow();
        employee.empShow();

    }
}
