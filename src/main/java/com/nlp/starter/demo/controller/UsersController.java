package com.nlp.starter.demo.controller;


import com.nlp.starter.demo.entity.Users;
import com.nlp.starter.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/users")
public class UsersController {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping("/")
    public @ResponseBody List<Users> createUsers( @RequestParam Map<String,String> param){
        String name = param.get("name");
        String tel = param.get("tel");
        String addr = param.get("addr");
        String det =param.get("det");
        Users user = Users.builder().name(name).tel(tel).addr(addr).det(det).build();
        usersRepository.save(user);
        return usersRepository.findAll();
    }

    @GetMapping("/all")
    public @ResponseBody List<Users> findAllUsers(){
        return usersRepository.findAll();
    }
}
