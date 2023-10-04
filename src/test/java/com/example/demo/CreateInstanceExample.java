package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CreateInstanceExample {

    //if you do not autowire you have to initialize it
    HouseHold home = new HouseHold();

    @Test
    void testCreatingInstances(){

        // Still returns the beans with no spring magic
        Person person1 = home.person();
        Animal pet1 = home.pet();

        System.out.println(person1.getFirstName());
        System.out.println(pet1.getAnimalName());
    }
}
