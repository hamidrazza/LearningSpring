package com.hamid.JobRestApp.controller;

import com.hamid.JobRestApp.model.User;
import com.hamid.JobRestApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("register")
    public User registerUser(User user){
        return service.addUser(user);
    }
}
