package com.deneme.denemeDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class WebApplication {

    @RequestMapping("/")
    String home() {
       return "Hello World!";
    }

}
