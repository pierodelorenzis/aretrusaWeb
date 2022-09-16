package com.example.aretrusaWeb.model;


public class Editor {
    private String name;
    private String city;
    private String address;
    private String telephone;

    public Editor(String name, String city, String address, String telephone){

        this.name = name;
        this.city = city;
        this.address = address;
        this.telephone = telephone;

    }

    public Editor(){

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

