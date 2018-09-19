package com.example;

import com.example.config.IocConfig;
import com.example.spbdemo.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Startrt {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext(IocConfig.class);
        UserService userService=ac.getBean(UserService.class);
        userService.save();

        IocConfig iocConfig= (IocConfig) ac.getBean("iocConfig");
        System.out.println(iocConfig);

        System.out.println(iocConfig.dataSource());

    }
}
