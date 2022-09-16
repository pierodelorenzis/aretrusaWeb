package com.example.aretrusaWeb.view;

import com.example.aretrusaWeb.model.User;
import com.example.aretrusaWeb.service.UserService;

import javax.persistence.Id;
import java.util.Date;

public class UiUser {

    public String email;
    public String username;
    public String password;
    public String cf;
    public String name;
    public String surname;
    public Date birthdate;
    public String sex;
    public String city;
    public String address;
    public String telephone;
    public String role;

    public UiUser(User user) {
        this.email = user.getEmail();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.cf = user.getCf();
        this.name = user.getName();
        this.surname = user.getSurname();
        this.birthdate = user.getBirthdate();
        this.sex = user.getSex();
        this.city = user.getCity();
        this.address = user.getAddress();
        this.telephone = user.getTelephone();
        this.role = user.getRole();
    }


}
