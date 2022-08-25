package com.springboot.demo.service;

import com.springboot.demo.entity.User;

import java.util.List;

public interface UserService {
    public User UserRegist(User user);
    public List<User>   QueryById(int UserId);
    public List<User> QueryAll();
    public String DeleteUserById(int user_id);
    public User UpdateUserById(User user);
    public String DeleteUserNull();
}
