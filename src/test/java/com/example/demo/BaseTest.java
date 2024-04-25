package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@Component
public class BaseTest {

    @PostConstruct
    public void setup(){
        //будет вызван после создания конструктора
        System.out.println("PostConstruct");
        Driver.initDriver();
    }
}
