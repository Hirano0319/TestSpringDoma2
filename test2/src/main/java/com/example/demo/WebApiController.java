package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.services.TestUserService;


@RestController
@RequestMapping("api")
public class WebApiController {

    @Autowired
    private TestUserService tus;


    @RequestMapping("hello")
    private String hello() {
        return "SpringBoot!"+tus.getTestUser(1).name;
    }

}
