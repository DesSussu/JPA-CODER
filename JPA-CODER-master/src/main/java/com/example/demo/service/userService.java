package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

    @Autowired
    private UserRestApi userRestApi;


    public List<String> getUsuarios(int id) {
        return userRestApi.getUsuarios(id);
    }
}


