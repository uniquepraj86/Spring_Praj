package com.praj.spring.onetoone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Adhar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;

    private Long addhar;

    public Long getAddhar() {
        return addhar;
    }

    public void setAddhar(Long addhar) {
        this.addhar = addhar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
