package com.praj.spring.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

@Component
@Scope(SCOPE_SINGLETON)
public class Employee {


    public Employee()
    {
        System.out.println("Emp object constructor");
    }

   public void empShow(){
        System.out.println("In Employee");
    }

}
