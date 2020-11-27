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
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        // 浏览器访问会返回Services: [eureka-server, eureka-client]
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}