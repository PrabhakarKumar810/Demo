package com.example.demo.Controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class PageController {

   // http://localhost:8080/home/page1
    @RequestMapping("/page1")
    @ResponseBody   //It is used for send the data on web-page
    public String home(){
        System.out.println("Home Page");
        return "home";
    }
}
