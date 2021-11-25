package com.fan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //ConfigurableApplicationContext 是 IOC容器，里面有所有的组件
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class,args);
        //getBeanDefinitionNames,从springboot容器里拿所有的组件的名称
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
