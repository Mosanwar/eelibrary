package edu.mum.mylibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping(value = {"/", "mylibrary", "/my-library", "/mylibrary/home"})
    public String displayHomePage(){
        return "home/index";
    }

}
