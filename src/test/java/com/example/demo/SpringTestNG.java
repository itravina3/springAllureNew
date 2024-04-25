package com.example.demo;

import com.codeborne.selenide.Selenide;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@SpringBootTest
public class SpringTestNG extends AbstractTestNGSpringContextTests {

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");
    }

    @Test
    public void test2() {
        System.out.println("Test2");
        Selenide.open("https://www.google.com");
        Selenide.sleep(5000);


    }


}

