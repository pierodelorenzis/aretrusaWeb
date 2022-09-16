package com.example.aretrusaWeb.view;


import com.example.aretrusaWeb.model.Author;

public class UiAuthor {

    public String name;
    public String lastName;

    public UiAuthor(Author author){
        this.name = author.getName();
        this.lastName = author.getLastName();
    }

    public UiAuthor(){

    }

    public String getName() {
        return name;
    }


    public String getLastName() {
        return lastName;
    }

}
