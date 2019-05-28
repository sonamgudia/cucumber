package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffPlan {
	
	static WebDriver driver = null;;
	@Given("I want to add a tariff plan with precondition")
	public void i_want_to_add_a_tariff_plan_with_precondition() {
	   System.setProperty("webdriver.gecko.driver", "C:\\Users\\my-pc\\vignesh\\CUC\\driver\\geckodriver.exe");
	   driver = new FirefoxDriver();
	  driver.get("http://demo.guru99.com/telecom/addtariffplans.php");

	}

	@When("I add the tariff plan")
	public void i_add_the_tariff_plan(DataTable dataTable) {
 List<String> dd = dataTable.asList(String.class);
	
	WebElement txtMRental = driver.findElement(By.id("rental1")) ;
	txtMRental.sendKeys(dd.get(0));
	/*
	WebElement txtLocMin = driver.findElement(By.xpath("//input[@name='local_minutes']")) ;
	txtLocMin.sendKeys(dd.get(0).get(0));
	  
	  WebElement txtIMin = driver.findElement(By.id("inter_minutes")) ;
	  txtIMin.sendKeys(dd.get(0).get(0));
	  
	  WebElement txtSms = driver.findElement(By.id("sms_pack")) ;
	  txtSms.sendKeys(dd.get(0).get(0));
	  
	  WebElement txtMChrg = driver.findElement(By.id("minutes_charges")) ;
	  txtMChrg.sendKeys(dd.get(0).get(0));
	  
	  WebElement txtIChrg = driver.findElement(By.id("inter_charges")) ;
	  txtIChrg.sendKeys(dd.get(0).get(0));
	  
	  WebElement txtSChrg = driver.findElement(By.id("sms_charges")) ;
	  txtSChrg.sendKeys(dd.get(0).get(0));
	
	  WebElement btnsubmit = driver.findElement(By.id("//input[@name='submit']")) ;
	  btnsubmit.click();*/
 
	}

	@Then("I validate the tariff plan is generated")
	public void i_validate_the_tariff_plan_is_generated() {
	System.out.println("validated");
	}


}
