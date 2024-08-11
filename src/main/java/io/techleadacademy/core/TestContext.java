package io.techleadacademy.core;

import io.cucumber.java.Scenario;
import io.techleadacademy.pages.*;
import io.techleadacademy.utils.BrowserUtils;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class TestContext {

    private WebDriver driver;
    private BrowserUtils browserUtils;
    public Map<String, Object> sharedData;

    private final UI UI;
    private HomePage homePage;
    public Exception e;
    public Scenario scenario;


    public TestContext() {
        UI = new UI();
        sharedData = new HashMap<>();
        e = new Exception();
        browserUtils = new BrowserUtils(driver);
        homePage = new HomePage(driver);
    }
    public UI UI() {
        return this.UI;
    }


    public class UI {
        private final WebDriver driver;
        private final BrowserUtils browserUtils;
        private final HomePage homePage;

        public UI(){
            this.driver = new Driver().initializeDriver("chrome");
            this.browserUtils = new BrowserUtils(driver);
            this.homePage = new HomePage(driver);


        }
        public HomePage getHomePage() {
            return this.homePage;
        }

        public WebDriver getDriver() {
            return this.driver;
        }

        public BrowserUtils getBrowserUtils() {
            return this.browserUtils;
        }
    }

}
