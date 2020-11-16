package com.ykq.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @ClassName QualiferConfiguration
 * @Description TODO
 * @Author ykq
 * @Date 2020/11/11
 * @Version v1.0.0
 */
@Component
@Configuration
public class QualifierConfiguration {
    @Qualifier
    @Bean
    User user1() {
        return new User("a");
    }

    @Qualifier
    @Bean
    User user2() {
        return new User("b");
    }
}
