package com.cxytiandi.spring_boot_example.controller;

import com.cxytiandi.spring_boot_starter_demo.config.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/user/name")
    public String getUsername() {
        return userClient.getName();
    }
}
