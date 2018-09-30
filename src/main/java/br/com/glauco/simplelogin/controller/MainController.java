package br.com.glauco.simplelogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {


    @RequestMapping("/")
    public String index(){

        return "index";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }
}
