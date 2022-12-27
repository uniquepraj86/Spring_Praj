package com.praj.spring.manytomany.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String city;

    private String CityCode;

    @ManyToMany
    @JoinTable(name = "city_pin_code", joinColumns = {@JoinColumn(name = "city_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "Pin_id", referencedColumnName = "id")})
    private List<PinCode> pinCodes;


}


//firstenm
//secondenem
//