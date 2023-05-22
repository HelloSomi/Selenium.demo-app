package com.example.Selenium.demoapp;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@SpringBootTest
@CucumberContextConfiguration
@CucumberOptions(features = "src/test/resources", glue = "com.example.Selenium.demoapp")
public class RunCucumberTest {

}