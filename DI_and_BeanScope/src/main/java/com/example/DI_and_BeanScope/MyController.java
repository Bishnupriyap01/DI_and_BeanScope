package com.example.DI_and_BeanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
//    field injection
//    @Autowired
    private  MyService myService;

    // Constructor dependency injection
//    public MyController(MyService myService) {
//        this.myService = myService;
//    }
//    Setter Injection
    @Autowired
    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/perform")
    public String performAction() {
        return myService.performService();

    }
}
