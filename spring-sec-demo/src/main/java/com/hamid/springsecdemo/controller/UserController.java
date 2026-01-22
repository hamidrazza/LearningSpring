package com.hamid.springsecdemo.controller;

import com.hamid.springsecdemo.model.User;
import com.hamid.springsecdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("register")
    public User userRegister(@RequestBody User user){
        service.registerUser(user);
        return user;
    }
}
