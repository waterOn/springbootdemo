package com.cp.service;

import com.cp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cp.repository.*;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepositoty;

    public User findUserByName(String name){
        User user = null;
        try{
            user = userRepositoty.findBYUserName(name);
        }catch (Exception e){}
        return user;
    }

}
