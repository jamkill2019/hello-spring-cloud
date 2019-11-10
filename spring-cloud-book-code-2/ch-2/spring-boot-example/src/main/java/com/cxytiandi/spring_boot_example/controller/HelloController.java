package com.cxytiandi.spring_boot_example.controller;

import com.cxytiandi.spring_boot_example.config.MyConfig;
import com.cxytiandi.spring_boot_example.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //使用@Value方式注入配置文件的信息
    //application.yml文件中需要配置相关信息才行，否则会报错
    @Value("${server.port}")
    private String port;

    @Autowired
    private MyConfig myConfig;

    @GetMapping("/hello")
    public String hello() {
        return port;
    }

    @GetMapping("/hello2")
    public String hello2() {
        String name = myConfig.getName();
        return name;
    }

    @GetMapping("/hello3")
    public void hello3(String name) {
        myConfig.setName(name);
    }

    @Autowired
    LogService logService;

    @GetMapping("/async")
    public String async() {
        logService.saveLog();
        return "Async test success";
    }
}
