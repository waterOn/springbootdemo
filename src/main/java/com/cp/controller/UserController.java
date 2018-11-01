package com.cp.controller;

import com.cp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cp.service.*;

/**
 * Created by cp on 2018 10/29
 * User控制层
 */
@Controller
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/index")
    public String index(){
        return "user/index";
    }

    @RequestMapping(value = "/user/show",method = RequestMethod.GET)
    @ResponseBody
    public String show(@RequestParam(value = "name")String name){
        User user = userService.findUserByName(name);
        if(null != user)
            return user.getId()+"/"+user.getName();
        else return "null";
    }


}
