package com.springboot.demo.service.imp;

import com.springboot.demo.dao.UserDao;
import com.springboot.demo.entity.User;
import com.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Resource
    private UserDao userDao;


    @Override
    public User UserRegist(User user) {
        int i=userDao.InsertUser(user);
        if (i>0){
            return user;
        }
        return null;
    }
@Override
    public List<User>  QueryById(int UserId){
        return userDao.QueryById(UserId);
    }
    @Override
    public List<User> QueryAll() {
        return userDao.QueryAll();

    }
    @Override
    public String DeleteUserById(int UserId){
        int i=userDao.DeleteUserById(UserId);
        if (i>0){
           return "删除成功！";
        }else {
            return"删除失败！";
        }
    }

    @Override
    public User UpdateUserById(User user) {
        int i=userDao.UpdateUserById(user);
        if (i>0){
            return user;
        }
        return null;
    }

    @Override
    public String DeleteUserNull() {
        boolean i=userDao.DeleteUserNull();
        if (i==true){
            return "删除成功！";
        }else {
            return"删除失败！";
        }
    }
    }

