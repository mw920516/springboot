package com.example.spbdemo;

import org.springframework.stereotype.Repository;


@Repository
public class UserDao {
    public  void test(){
        System.out.println("dao层输出");
    }
}
