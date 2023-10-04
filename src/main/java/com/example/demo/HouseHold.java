package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HouseHold {
    @Bean
    public Person person(){
        return new Person("Jake", "Gonzales");
    }

    @Bean
    public Animal pet(){
        return new Animal("fakeAnimal", "cat");
    }

}
