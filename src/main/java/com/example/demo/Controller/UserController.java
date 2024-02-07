package com.example.demo.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.*;


//Simple API Develop.

@RestController
@RequestMapping("/api/user")
public class UserController {


    //http://localhost:8080/api/user/get
    @GetMapping("/get")
    public String gettUser(){
        return "KK";
    }
    @PreAuthorize("hasrole('ADMIN')")
    @PostMapping("/post")
    public String postUser(){
        return "PK";
    }
    @PutMapping("/put")
    public String putUser(){
        return "YK";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "Deleted!!";
    }
}
