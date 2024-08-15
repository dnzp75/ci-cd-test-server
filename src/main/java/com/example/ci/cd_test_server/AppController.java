package com.example.ci.cd_test_server;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public  String home(){
        return "Hi, World! LeeGeonHui";
    }

    @GetMapping("/")
    public  String home2(){
        return "Hi, World! LeeGeonHuifdsfasdfasdfasdfasdfasdfsadf";
    }

}
