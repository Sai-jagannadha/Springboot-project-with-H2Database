package com.saideveloper.SpringbootprojectwithH2Database.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String hellocontroller(){
        return "welcome to spring boot";
    }
    @GetMapping("/show")
    public String showmessage(){
        return "Hii this is welcome to my page";
    }
}
