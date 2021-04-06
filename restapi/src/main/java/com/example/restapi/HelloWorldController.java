package com.example.restapi;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("/say")
    @ApiOperation(value="Say, Hello Swagger!", notes="This just says hello")
    public String sayHello() {
        return "Hello Swagger";
    }
    /* Create the Swagger Related Config */
}
