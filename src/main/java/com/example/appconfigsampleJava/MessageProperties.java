package com.example.appconfigsampleJava;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "config")
public class MessageProperties {
    private String message;
    private String message1;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public String getMessage1() {
        return message1;
    }


}
