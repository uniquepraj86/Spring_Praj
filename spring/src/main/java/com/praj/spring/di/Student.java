package com.praj.spring.di;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;




@Component
public class Student {
    @Autowired

    private Subject subject;                   //field Based

//    public Student(Subject subject) {
//        this.subject = subject;              // constructor
//    }
//
//    public void setSubject(Subject subject) {
//        this.subject = subject;                 //setter
//    }

    @Autowired
    private Subject subject1;


  public void showStudSub(){
      subject.display();
      subject1.display1();
    }
}
