package com.ykq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author ykq
 * @Date 2020/11/11
 * @Version v1.0.0
 */
@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/orders")
    public String getOrderList() {
        return port + "：展示所有订单";
    }
}
