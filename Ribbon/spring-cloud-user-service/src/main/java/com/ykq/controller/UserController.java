package com.ykq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName controller
 * @Description TODO
 * @Author ykq
 * @Date 2020/11/11
 * @Version v1.0.0
 */
@RestController
public class UserController {

/*  方式1、
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    String s = restTemplate.getForObject("http://localhost:8081/orders", String.class);
    */

/*  方式2、
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    private RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }
    String s = restTemplate.getForObject("http://localhost:8081/orders", String.class);
    */

/*  @GetMapping("/user/{id}")
    public String getUser(@PathVariable Integer id) {
        String s = restTemplate.getForObject("http://localhost:8081/orders", String.class);
        return "用户" + id + "\n" +s;
    }
    */

/*  负载均衡方法1、
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable Integer id) {
        ServiceInstance serviceInstance = loadBalancerClient.choose("spring_cloud_order_service");
        String url = String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort() + "/orders");
        String s = restTemplate.getForObject(url, String.class);
        return "用户" + id + "\n" +s;
    }*/

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    private RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable Integer id) {
        String s = restTemplate.getForObject("http://spring-cloud-order-service/orders", String.class);
        return "用户" + id + "\n" +s;
    }
}
