package com.codeq.Springboot_Docker_Demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    
    @GetMapping
    public String getDockerName(){
        return "docker implementation with image creattion";
    }
    
}
