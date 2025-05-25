package com.coding.docker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class OrderController {

    @Value("${server.port:8080}")
    private String port;

    @RequestMapping("/order/docker")
    public String helloDocker() {
        return String.format("Hello Docker! I'm running on port %s with id=%s", port, UUID.randomUUID());
    }


}
