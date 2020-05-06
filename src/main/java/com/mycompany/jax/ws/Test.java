/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jax.ws;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String [] args)
    {
        ApplicationContext application = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = application.getBean("userService",UserService.class);
        User user = new User();
        user.setUserName("Shimaaaaaa");
        user.setSalary(10022);
        user.setBonus(6000);
        user.setDeduction(200);
        System.out.println("NetSalary" + userService.getNetSalary(user));


    }
    
}
