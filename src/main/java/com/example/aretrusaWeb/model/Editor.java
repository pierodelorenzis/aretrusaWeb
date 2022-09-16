package com.example.aretrusaWeb.model;

import org.springframework.data.annotation.Id;

public class Editor {

    @Id
    private Long id;
    private String name;
    private String city;
    private String address;
    private String telephone;

    public Editor(Long id, String name, String city, String address, String telephone){

        this.id = id;
        this.name = name;
        this.city = city;
        this.address = address;
        this.telephone = telephone;

    }

    public Editor(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}

