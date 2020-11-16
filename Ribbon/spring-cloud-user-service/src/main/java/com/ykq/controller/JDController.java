package com.ykq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName JDController
 * @Description TODO
 * @Author ykq
 * @Date 2020/11/12
 * @Version v1.0.0
 */
@Controller
public class JDController {

    @GetMapping("/jd")
    public String getPage() {
        return "jd.html";
    }
}
