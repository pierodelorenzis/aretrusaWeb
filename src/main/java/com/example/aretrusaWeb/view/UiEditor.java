package com.example.aretrusaWeb.view;

import com.example.aretrusaWeb.model.Editor;

public class UiEditor {

    public String name;
    public String city;
    public String address;
    public String telephone;

    public UiEditor(Editor editor){
        this.name = editor.getName();
        this.city = editor.getCity();
        this.address = editor.getAddress();
        this.telephone = editor.getTelephone();
    }

    public UiEditor(){

    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }


    public String getTelephone() {
        return telephone;
    }

}
