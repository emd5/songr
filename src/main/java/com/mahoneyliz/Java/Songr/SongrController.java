package com.mahoneyliz.Java.Songr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SongrController {

    @GetMapping("/hello")
    public String getHelloWorld(){
        return "Hello World!";
    }

    @GetMapping("/capitalize/{input}")
    public String getRabbits(@PathVariable String input){
        return input;
    }
}
