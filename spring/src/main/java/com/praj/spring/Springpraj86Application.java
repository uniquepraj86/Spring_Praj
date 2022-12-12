package com.praj.spring;

import com.praj.spring.di.Company;
import com.praj.spring.di.Student;
import com.praj.spring.ioc.Idea;
import com.praj.spring.ioc.Jio;
import com.praj.spring.ioc.Vodafone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Springpraj86Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Springpraj86Application.class, args);
//       Vodafone obj = context.getBean(Vodafone.class);
//        Jio obj1 = context.getBean(Jio.class);
//        Idea obj2 = context.getBean(Idea.class);
//        obj.show();
//        obj1.call();
//        obj2.msg();

        Student student = context.getBean(Student.class);
        student.showStudSub();

//
//        Company company =context.getBean(Company.class);
//		company.showCompanyEmp();


            //		Vodafone obj = new Vodafone();
           //		obj.show();

    }

    @GetMapping("hi")
    public String helloMsg() {
        return "Hello Spring";
    }
}
