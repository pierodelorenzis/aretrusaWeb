package com.example.aretrusaWeb.view;


public class UiAuthor {

    public String name;
    public String lastname;

    public UiAuthor(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public UiAuthor(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
