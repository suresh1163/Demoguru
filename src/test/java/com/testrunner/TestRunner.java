package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\bookwithexcel.feature",glue="com.stepdefinition",dryRun=false, monochrome=true, plugin= {"html:target","json:target/cucur.json"})
public class TestRunner {	
}
