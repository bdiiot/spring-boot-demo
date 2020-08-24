package com.bdiiot.springboot.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "desc of class")
@RestController
public class HelloController {
    @ApiOperation(value = "desc of method", notes = "")
    @GetMapping("/hello")
    public Object hello(@ApiParam(value = "desc of param", required = true) @RequestParam String name) {
        return "Hello " + name + "!";
    }
}
