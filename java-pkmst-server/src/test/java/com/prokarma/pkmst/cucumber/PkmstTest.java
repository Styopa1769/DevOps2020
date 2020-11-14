package com.prokarma.pkmst.cucumber;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@ActiveProfiles("test")
@CucumberOptions(format = { "pretty", "html:target/cucumber-html-report",
 "json:./report/auto-report-json/auto.json",
 "json:./report/employee-report-json/employee.json",
 "json:./report/dealer-report-json/dealer.json",
 })
public class PkmstTest {
}