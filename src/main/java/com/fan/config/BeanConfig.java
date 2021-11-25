package com.fan.config;

import com.fan.bean.Dog;
import com.fan.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class BeanConfig {
    @Bean
    public Dog dog(){
        return new Dog(1,"小黄");
    }
    @Bean
    public Person person(){
        Person person1 = new Person(1,"xiaoli");
        //在proxyBeanMethods为false时，因为执行了一下dog()方法那么就会新建一个dog，和上面这个dog是不一样的
        person1.setDogPet(dog());
        return person1;
    }


}
