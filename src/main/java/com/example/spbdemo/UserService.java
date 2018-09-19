package com.example.spbdemo;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userdao;


    public  void  save(){
        System.out.println("service层");
        userdao.test();
    }
}
