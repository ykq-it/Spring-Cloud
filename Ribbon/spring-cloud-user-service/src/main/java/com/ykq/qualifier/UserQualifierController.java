package com.ykq.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author ykq
 * @Date 2020/11/11
 * @Version v1.0.0
 */
@RestController
public class UserQualifierController {

    //    @Qualifier
    @Autowired
    private List<User> users = Collections.emptyList();

    @GetMapping("/users")
    public String getUser() {
        return users.toString();
    }
}
