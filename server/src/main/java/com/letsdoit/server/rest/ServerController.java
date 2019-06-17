package com.letsdoit.server.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server/v1/test")
public class ServerController {
    @GetMapping
    @ResponseBody
    public String sayHello(){
        return "Hello from server !";
    }
}
