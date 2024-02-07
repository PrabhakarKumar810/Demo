package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/show")
public class DemoRestController {

    //http://localhost:8080/show/page1

//    @RequestMapping("/page1")
//    public List<String> getMessage(){
//        System.out.println("Message");
//        return List.of("Prabhakar","Sam","Mike");
//    }

    @RequestMapping("/page2")
    public List<Integer> getInteger(){
        System.out.println("Message");
      //  return List.of(3,3,4,44,5,4,3,2,2);
        return null;
    }
}
