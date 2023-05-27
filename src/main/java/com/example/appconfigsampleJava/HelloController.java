package com.example.appconfigsampleJava;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ConfigurationProperties("controller")
public class HelloController {

    private final MessageProperties properties;

    public HelloController(MessageProperties properties) {
        this.properties = properties;

    }

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/message")
    @ResponseBody
    public String getMessage() {
        return "Message: " + properties.getMessage() + "\n" + "Message1: ";
    }

}