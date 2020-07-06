package com.nlp.starter.demo.service;
import com.nlp.starter.demo.entity.Users;

import java.util.List;

public interface UsersService {
    Users save(Users user);
    void delete(Integer sno);
    Users getUser(Integer sno);
    List<Users> getAllUsers();
}
