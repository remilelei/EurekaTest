package com.hamaliel.controller;

import com.hamaliel.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/restTemplate")
public class RestTemplateController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        return restTemplate.postForObject("http://localhost:8010/user/save", user, User.class);
    }

    @GetMapping("port")
    public String getPort() {
        return restTemplate.getForObject("http://provider/user/getPort", String.class);
    }
}
