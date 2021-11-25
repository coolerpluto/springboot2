package com.fan.config;

import com.fan.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public Dog dog(){
        return new Dog(1,"小黄");
    }
}
