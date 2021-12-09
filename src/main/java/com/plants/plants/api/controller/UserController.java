package com.plants.plants.api.controller;

import com.plants.plants.api.entity.User;
import com.plants.plants.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("")
    public String addUser(@RequestBody User user){

        String password=user.getPassword();
        String encryptedPassword=passwordEncoder.encode(password);
        user.setPassword(encryptedPassword);
        userRepository.save(user);

        return "User " +user.getUsername()+" Added Successfully";
    }
}
