package com.example.financemanager.controller;

import com.example.financemanager.model.User;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    public List<User> users = new ArrayList<>();

    @GetMapping("/greeting")
    public String greeting(){
        System.out.println("hello");
        return "Hello!";
    }

    @GetMapping
    public List<User> getUsers(){
        return users;
    }

//    @GetMapping("/{id}")
    public User getUser(@RequestParam(value = "id") int id ) {
        //return user from repo
        return users.forEach();
    }

    @PostMapping
    public ResponseEntity<UserResponse> createUser(User user){
        users.add(user);
    }
//
//    public void updateUser(User user) {
//
//    }
}
