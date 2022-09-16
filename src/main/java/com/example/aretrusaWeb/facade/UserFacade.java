package com.example.aretrusaWeb.facade;

import com.example.aretrusaWeb.model.User;
import com.example.aretrusaWeb.service.UserService;
import com.example.aretrusaWeb.view.UiUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserFacade {

    @Autowired
    UserService userService;

    public UiUser createFakeUser()
    {
        User fakeUser = userService.getFakeUser();
        return new UiUser(fakeUser);
    }
}
