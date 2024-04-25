package com.example.demo;


import com.codeborne.selenide.Selenide;
import com.example.demo.pages.HomePage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestSelenide extends BaseTest{

    @Autowired
    private HomePage homePage;

    @Test
    public void testHomePage(){
        homePage.getHomePage();
        Selenide.sleep(5000);
}}
