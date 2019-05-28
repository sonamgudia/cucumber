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

public class AddTariff2 {
	
	static WebDriver driver;
	


	@Given("I want to write a step withs")
	public void i_want_to_write_a_step_withs() {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\my-pc\\vignesh\\CUC\\driver\\geckodriver.exe");
		   driver = new FirefoxDriver();
		  driver.get("http://demo.guru99.com/telecom/addtariffplans.php");
	}

	/*@When("I want to add tariff plan {string},{string},{string},{string},{string},{string},{string}")
	public void i_want_to_add_tariff_plan(String mrent, String flm, String fim, String fsm, String lc, String ic, String sc,DataTable dataTable) {

		List<String> dd = dataTable.asList(String.class);
			
			WebElement txtMRental = driver.findElement(By.id("rental1")) ;
			txtMRental.sendKeys("monthly rent");
			
			WebElement txtLocMin = driver.findElement(By.xpath("//input[@name='local_minutes']")) ;
			txtLocMin.sendKeys("free local minute");
			  
			  WebElement txtIMin = driver.findElement(By.id("inter_minutes")) ;
			  txtIMin.sendKeys("free international minute");
			  
			  WebElement txtSms = driver.findElement(By.id("sms_pack")) ;
			  txtSms.sendKeys("free SMS pack");
			  
			  WebElement txtMChrg = driver.findElement(By.id("minutes_charges")) ;
			  txtMChrg.sendKeys("local per minute charge");
			  
			  WebElement txtIChrg = driver.findElement(By.id("inter_charges")) ;
			  txtIChrg.sendKeys("international per minute charge");
			  
			  WebElement txtSChrg = driver.findElement(By.id("sms_charges")) ;
			  txtSChrg.sendKeys("SMS charge");
			
			  WebElement btnsubmit = driver.findElement(By.id("//input[@name='submit']")) ;
			  btnsubmit.click();
		 }*/

	@When("I want to add tariff plan in form {string},{string},{string},{string},{string},{string},{string}")
	public void i_want_to_add_tariff_plan_in_form(String a, String b, String c, String d, String e, String f, String g) {
		WebElement txtMRental = driver.findElement(By.id("rental1")) ;
		txtMRental.sendKeys(a);
		
		WebElement txtLocMin = driver.findElement(By.xpath("//input[@name='local_minutes']")) ;
		txtLocMin.sendKeys(b);
		  
		  WebElement txtIMin = driver.findElement(By.id("inter_minutes")) ;
		  txtIMin.sendKeys(c);
		  
		  WebElement txtSms = driver.findElement(By.id("sms_pack")) ;
		  txtSms.sendKeys(d);
		  
		  WebElement txtMChrg = driver.findElement(By.id("minutes_charges")) ;
		  txtMChrg.sendKeys(e);
		  
		  WebElement txtIChrg = driver.findElement(By.id("inter_charges")) ;
		  txtIChrg.sendKeys(f);
		  
		  WebElement txtSChrg = driver.findElement(By.id("sms_charges")) ;
		  txtSChrg.sendKeys(g);
		
		  WebElement btnsubmit = driver.findElement(By.xpath("//input[@name='submit']")) ;
		  btnsubmit.click();
	}

@Then("I verify the status in steps")
public void i_verify_the_status_in_steps() {
}

}
