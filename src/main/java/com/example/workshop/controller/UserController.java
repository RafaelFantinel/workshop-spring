package com.example.workshop.controller;

import com.example.workshop.controller.request.PostUserRequest;
import com.example.workshop.controller.response.PostUserResponse;
import com.example.workshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public PostUserResponse createUser(@RequestBody @Valid PostUserRequest request) {
        return userService.createrUser(request);

    }

}
