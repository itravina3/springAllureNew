package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;

@Configuration
public class Driver {

    //@ConditionalOnProperty(name = "enableVideo", havingValue = "true")
    //запустится, если в конфигурации указано enableVideo=true

   public static void initDriver() {
        com.codeborne.selenide.Configuration.browser = "firefox";



//        //если убрать, то будет локальный запуск
//        //Configuration.remote = "http://localhost:4444/wd/hub";
//
//        HashMap<String, Object> selenoidOptions = new HashMap<>();
//        selenoidOptions.put("name", "Test badge...");
//        selenoidOptions.put("sessionTimeout", "15m");
//        selenoidOptions.put("env", new ArrayList<String>() {{ add("TZ=UTC"); }});
//        selenoidOptions.put("labels", new HashMap<String, Object>() {{ put("manual", "true"); }});
//        selenoidOptions.put("enableVideo", true);
//        selenoidOptions.put("enableVNC", true);

        //browser = browser;


//        Configuration.headless = false;
//        //Configuration.browserCapabilities.setCapability("selenoid:options", selenoidOptions);
//        Configuration.browserCapabilities.setCapability("enableVNC", true);
//        if (browser.equalsIgnoreCase("chrome")) {
//            ChromeOptions chromeOptions = new ChromeOptions();
//            chromeOptions.setCapability("selenoid:options", selenoidOptions);
//            Configuration.browserCapabilities = chromeOptions;
//        } else if (browser.equalsIgnoreCase("firefox")) {
//            FirefoxOptions firefoxOptions = new FirefoxOptions();
//            firefoxOptions.setCapability("selenoid:options", selenoidOptions);
//            Configuration.browserCapabilities = firefoxOptions;
//        }
//
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }
}
