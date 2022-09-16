package com.example.aretrusaWeb.view;

public class UiEditor {

    public String name;
    public String city;
    public String address;
    public String telephone;

    public UiEditor(String name, String city, String address, String telephone){
        this.name = name;
        this.city = city;
        this.address = address;
        this.telephone = telephone;
    }

    public UiEditor(){

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
