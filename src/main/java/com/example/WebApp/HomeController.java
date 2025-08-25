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

}
