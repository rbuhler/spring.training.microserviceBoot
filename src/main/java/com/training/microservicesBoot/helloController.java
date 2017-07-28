package com.training.microservicesBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class helloController{

    @RequestMapping("/step3/{name}")
    public String infoHTML(Map model, @PathVariable String name){
        String message ="Step 4 - Response HTML with path variable.";
        model.put("name", name);

        System.out.println("[STEP3] Parameter \"name\" : " + name);

        return "hello";
    }

    @RequestMapping("/step2/{name}")
    public @ResponseBody String hiThere(Map model, @PathVariable String name){
        String message ="Step 3 - Response body with path variable.";
        model.put("name", name);

        return message.concat(" -> Hello ").concat(name);
    }

    @RequestMapping("/step1")
    public @ResponseBody String map(){
        String message ="Step 1 - simple URL mapping.";

        return message;
    }
    @RequestMapping("/")
    public @ResponseBody String welcome(){
        String message ="Step zero - Welcome.";

        return message;
    }
}