package com.example.ci.cd_test_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public  String home(){
        return "Hi, World! LeeGeonHuiasfddfasdfasdfasdfasdfasdfasdf";
    }

    @GetMapping("/ass")
    public  String home2(){
        return "Hi, World! LeeGeonHuiㅁㄴㅇㄹㅁㄴㅇㄹㅁㄴㅇㄹㅁㄴㅇㄹㅁㄴㅇㄹ";
    }


}
