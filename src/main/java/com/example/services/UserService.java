package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.*;
import com.example.entities.*;

@Service
public class UserService {

    private  UserDAO userDao;

    @Autowired
    public UserService(UserDAO userDao) {
        this.userDao=userDao;
    }
    
    public List<User> getAllUsers(){
    	return userDao.getAllUsers();
    }

}
