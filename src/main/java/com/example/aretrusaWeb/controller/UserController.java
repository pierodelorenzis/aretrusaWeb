package com.example.aretrusaWeb.controller;

import com.example.aretrusaWeb.facade.UserFacade;
import com.example.aretrusaWeb.view.UiUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserFacade userFacade;

    @GetMapping("/giveMeAUser")
    UiUser getUser()
    {
        return userFacade.createFakeUser();
    }
}
