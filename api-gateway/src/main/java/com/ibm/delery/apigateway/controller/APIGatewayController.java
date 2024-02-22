package com.ibm.delery.apigateway.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/gateway")
//@CrossOrigin(origins = "http://35.232.9.232")
public class APIGatewayController {

    @GetMapping(path = "/health")
    public String status() {

        return "API-Gateway path is healthy!";
    }
}
