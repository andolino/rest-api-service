package com.andolino.rest_api_service.controller;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private AtomicInteger totalRequests = new AtomicInteger(0);
    private LocalDateTime lastRequestTime;

    @GetMapping("/hello")
    public String sayHello() {
        int currentCount = totalRequests.incrementAndGet();
        lastRequestTime = LocalDateTime.now();

        return "Welcome oowa to the REST API Services!\n" +
               "Total Requests: " + currentCount + "\n" +
               "Last Request Time: " + lastRequestTime;
    }
}
