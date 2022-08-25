package com.springboot.demo.dao;

import com.springboot.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;



public interface UserDao {
    @Mapper
    int InsertUser(User user);
    @Mapper
    List<User> QueryById(int UserId);
    @Mapper
    List<User>QueryAll();
    @Mapper
    int DeleteUserById(int UserId);
    @Mapper
    int UpdateUserById(User user);
    @Mapper
    boolean DeleteUserNull();
}
