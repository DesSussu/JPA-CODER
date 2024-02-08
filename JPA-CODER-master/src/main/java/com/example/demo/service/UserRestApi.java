package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;




@Service
public class UserRestApi{
    /**
     *
     * @param id
     * @return usuarioPorId
     */
    public List<String> getUsuarios(int id) {
        RestTemplate restTemplate = new RestTemplate();
        final String url = "https://jsonplaceholder.typicode.com/users";
        return restTemplate.getForObject(url, List.class);
    }


}


