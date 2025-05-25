package com.coding.docker.controller;

import com.coding.docker.mapper.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class OrderController {

    @Autowired
    private TUserMapper userMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Value("${server.port:8080}")
    private String port;

    @RequestMapping("/order/docker")
    public String helloDocker() {
        return String.format("Hello Docker! I'm running on port %s with id=%s", port, UUID.randomUUID());
    }

    @GetMapping("/order/version")
    public String version() {
        return userMapper.mysqlVersion();
    }

    @GetMapping("/order/count")
    public String count() {
        Long count = stringRedisTemplate.opsForValue().increment("count");

        return "访问了【" + count + "】次！";
    }
}
