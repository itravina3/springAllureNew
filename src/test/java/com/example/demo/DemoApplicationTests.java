package com.example.demo;

import com.example.demo.pages.HomePage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.pages.MainPage;

@SpringBootTest
class DemoApplicationTests {
	//для инъекции классы должны быть помечены аннотацией @Component и быть в одном пакете
	@Autowired
	private HomePage homePage;

	@Autowired
	private MainPage mainPage;

	//для инъекции значения из application.properties в зависимости от среды (обозначается в конфигурации запуска теста)
	@Value("${spring.application.name}")
	private String appName;

	@Test
	void contextLoads() {
		homePage.getHomePage();
		mainPage.getMainPage();

		System.out.println("Application name: " + appName);
	}


}
