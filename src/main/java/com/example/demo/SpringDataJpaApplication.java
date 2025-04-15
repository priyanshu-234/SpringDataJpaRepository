package com.example.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Entity.User;
import com.example.demo.repository.UserRepository;
import java.util.*;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        // Get the UserRepository bean
        UserRepository u1 = context.getBean(UserRepository.class);

        // Create a new User object
        User obj = new User();
        obj.setId(2);
        obj.setName("Rahul");
        obj.setSirname("mishra");
        
        User obj1 = new User();
        obj.setId(3);
        obj.setName("Raj");
        obj.setSirname("mishra");
        
        // Save the user to the database
      List<User>  g=  new  ArrayList<>();
      
      g.add(obj);
      g.add(obj1);
      for(User  user : g) {
    	  System.out.println(user);
    	  
    	  
      }
      u1.save(obj);
       u1.save(obj1);
       

        System.out.println("User saved successfully!");
    }
}
