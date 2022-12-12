package com.praj.spring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimConfig {

    @Bean
    public Vodafone getVodafone(){
        return new Vodafone();
    }

    @Bean
    public Jio getJio(){
        return new Jio();
    }

    @Bean
    public Idea getIdea(){
        return new Idea();
    }
}

