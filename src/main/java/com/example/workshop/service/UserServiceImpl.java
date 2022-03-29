package com.example.workshop.service;

import com.example.workshop.controller.request.PostUserRequest;
import com.example.workshop.controller.response.PostUserResponse;
import com.example.workshop.model.UserModel;
import com.example.workshop.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public PostUserResponse createrUser(PostUserRequest request) {
        var userModel = new UserModel();
        var saveUserResponse = new PostUserResponse();

        BeanUtils.copyProperties(request, userModel);

        userRepository.save(userModel);

        BeanUtils.copyProperties(userModel, saveUserResponse);

        return saveUserResponse;

    }
}
