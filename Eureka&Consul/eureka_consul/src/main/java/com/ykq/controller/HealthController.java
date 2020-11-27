package com.ykq.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DcController
 * @Description TODO
 * @Author ykq
 * @Date 2020/11/26
 * @Version v1.0.0
 */
@RestController
public class HealthController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/health")
    public boolean dc() {
        return true;
    }

}