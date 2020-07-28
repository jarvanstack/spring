package com.bmft.config;

import com.bmft.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 使用这个类来代替applicationContext.xml的配置
 */
@Configuration //使用这个代表这是一个配置类
public class MyBeanConfig {
    @Bean//使用这个代表这是一个bean
    public User user (){
        return new User();
    }
}
