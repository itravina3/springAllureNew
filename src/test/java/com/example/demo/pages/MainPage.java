package com.example.demo.pages;

import org.springframework.stereotype.Component;

@Component
public class MainPage {
    public MainPage() {
        System.out.println("MainPage bean created!");
    }

        public String getMainPage() {
        return "Welcome to the main page!";}
}
