package com.hamaliel.controller;

import com.hamaliel.dao.UserDao;
import com.hamaliel.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private UserDao userDao;

    @GetMapping("/test")
    public String test(@RequestParam(name = "name", defaultValue = "world") String name) {
        String template = "hello %s!";
        return String.format(template, name);
    }

    @GetMapping("/getById")
    public User getUserById(@RequestParam(name = "id", required = true) Long id) {
        return userDao.getById(id);
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        userDao.insert(user);
        return user;
    }

    @GetMapping("/getPort")
    public String getServerPort() {
        return "get service from port " + this.port;
    }

}
