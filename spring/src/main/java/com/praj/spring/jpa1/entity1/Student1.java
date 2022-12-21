package com.praj.spring.jpa1.entity1;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Student1 {
    @Id
    private int id;
    private String name;
    private String address;
    private Integer MobileNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(Integer mobileNo) {
        MobileNo = mobileNo;
    }
}
