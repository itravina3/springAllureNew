package com.example.demo.pages;

import org.springframework.stereotype.Component;

@Component
public class HomePage {
    public HomePage() {
        System.out.println("HomePage bean created!");
    }

    public String getHomePage() {
        return "Welcome to the home page!";
    }
}
