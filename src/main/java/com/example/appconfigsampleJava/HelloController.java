package com.example.appconfigsampleJava;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.azure.spring.cloud.feature.management.FeatureManager;


@Controller
@ConfigurationProperties("controller")
public class HelloController {

    private final MessageProperties properties;
    private FeatureManager featureManager;

    public HelloController(MessageProperties properties, FeatureManager featureManager) {
        this.properties = properties;
        this.featureManager = featureManager;

    }

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/welcome")
    public String mainWithParam(Model model) {
        model.addAttribute("Beta", featureManager.isEnabledAsync("Beta").block());
        return "welcome";
    }

    @GetMapping("/message")
    @ResponseBody
    public String getMessage() {
        return "Message: " + properties.getMessage() + "\n" + "Message1:" + properties.getMessage1()+ "\nKey Vault message: " + properties.getKeyVaultMessage();
    }

}