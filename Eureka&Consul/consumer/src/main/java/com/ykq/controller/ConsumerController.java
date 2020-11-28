package com.ykq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConsumerController
 * @Description TODO
 * @Author ykq
 * @Date 2020/11/27
 * @Version v1.0.0
 */
@RestController
public class ConsumerController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    RestTemplate restTemplate;

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/test")
    public String test() {
//        ServiceInstance s = loadBalancerClient.choose("eureka-client");
//        return restTemplate.getForObject("http://"+s.getHost()+":"+s.getPort()+"/dc", String.class) + s.getPort();
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
//        return "1";
    }
}
