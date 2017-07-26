package com.training.microservicesBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class helloController{

    @RequestMapping("/hi/{name}")
    public @ResponseBody String hiThere(Map model, @PathVariable String name){
        model.put("name", name);

        return "Hello " + name;
    }
}
