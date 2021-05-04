package com.devteam.social_network.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-controller")
public class TestController {

    @GetMapping("/test")
    @ApiOperation("test")
    public ResponseEntity<String> test(){
        return ResponseEntity.status(HttpStatus.OK).body("Test");
    }

}
