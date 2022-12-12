package com.praj.spring.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

@Component
@Scope(SCOPE_SINGLETON)

public class Subject {

    public Subject()
    {
        System.out.println("Getting Subject");
    }
    public void display(){
        System.out.println("Physics");
        System.out.println("Chemistry");
        System.out.println("Math");
    }
    public void display1(){
        System.out.println("Physics");
        System.out.println("Chemistry");
        System.out.println("Math");
    }

}
