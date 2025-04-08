package com.runner;

import org.testng.annotations.Test;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    plugin = {"pretty", "html:target/cucumber-reports/Cucumber.html",
    		            "json:target/cucumber-reports/Cucumber.json",
    		            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
    features = "src\\test\\resources\\Features",
    glue = "com.definitions"
)
public class runclass extends AbstractTestNGCucumberTests {
    @Test
    public void f() {
    }
}
