package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// When you annotate a file as Configuration it is tracked like a bean so you can use autowire annotation
@Configuration
public class HouseHold {
    /* To reference these beans you call the method which will create
       instances of that object.
     */


    @Bean
    public Person person(){
        return new Person("Jake", "Gonzales");
    }

    @Bean
    public Animal pet(){
        return new Animal("fakeAnimal", "cat");
    }

}
