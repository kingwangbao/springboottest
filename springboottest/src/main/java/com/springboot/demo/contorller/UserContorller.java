package com.springboot.demo.contorller;

import com.springboot.demo.entity.User;
import com.springboot.demo.service.UserService;
import com.springboot.demo.service.imp.UserServiceImp;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserContorller {
 @Autowired
    private UserService userService;
    @RequestMapping("/regist")
    @ResponseBody
    public User regist(User user){
        return userService.UserRegist(user);
    }

    @RequestMapping("/queryid")
    @ResponseBody
    public List<User>   QueryById(int UserId){
        return userService.QueryById(UserId);
    }
    @RequestMapping("/query")
    @ResponseBody
    public List<User> QueryAll(){
        return userService.QueryAll();
    }
    @RequestMapping("/DeleteUserById")
    @ResponseBody
    public String  DeleteUserById(int UserId){
       return userService.DeleteUserById(UserId);
    }

   @RequestMapping("/DeleteUserNull")
   @ResponseBody
   public String  DeleteUserById(){
      return userService.DeleteUserNull();
   }
   @RequestMapping("/UpdateUserById")
   @ResponseBody
   public User  UpdateUserById(User user){
      return userService.UpdateUserById(user);
   }

}
