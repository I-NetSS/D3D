package com.d3d.testing;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", strict = true,tags = {"@tag0"},plugin = {"json:target/cucumber.json"})
public class RunCukesTest {
}
