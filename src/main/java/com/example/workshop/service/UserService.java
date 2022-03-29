package com.example.workshop.service;

import com.example.workshop.controller.request.PostUserRequest;
import com.example.workshop.controller.response.PostUserResponse;

public interface UserService {

    PostUserResponse createrUser(final PostUserRequest request);
}
