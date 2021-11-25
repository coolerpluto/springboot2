package com.fan;

import com.fan.bean.Dog;
import com.fan.bean.Person;
import com.fan.config.BeanConfig;
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

        //单实例
        Dog dog1 = run.getBean("dog", Dog.class);
        Dog dog2 = run.getBean("dog", Dog.class);
        System.out.println(dog1 == dog2);
        System.out.println("************************************");
        BeanConfig beanConfig = run.getBean(BeanConfig.class);
        //设置配置类不做代理，那么，每次用代理对象去调用同一个bean方法，得到的不是地址相同的一个bean
        Dog dogg1 = beanConfig.dog();
        Dog dogg2 = beanConfig.dog();
        System.out.println(dogg1 == dogg2);
        System.out.println("************************************");
        Person personn1 = run.getBean("person", Person.class);
        Dog dogg3 = run.getBean("dog", Dog.class);
        System.out.println(personn1.getDogPet() == dogg3);
    }
}
