package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody
    String greeting() {
        return "Hello, World!";
    }

    @RequestMapping("/AnaLeticia")
    public @ResponseBody
    String greetingAnaLeticia() {
        return "Hello, Ana Leticia!";
    }

    @RequestMapping("/AnaLeticia/age")
    public @ResponseBody
    String greetingAnaLeticiaAge() {
        return "Hello, I am Ana Leticia! I am 19 years old.";
    }

    @RequestMapping("/AnaLeticia/location")
    public @ResponseBody
    String greetingAnaLeticiaLocation() {
        return "Hello, I am Ana Leticia! I live in Brazil.";
    }

    @RequestMapping("/hotfix")
    public @ResponseBody
    String hotfix() {
        return "This is a hotfix endpoint.";
    }

}
