package Testng_pgm;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Testng_assertion {
	
	
	public WebDriver driver;
	
  @Test
  public void user() 
  {
	  WebElement element = driver.findElement(By.id("user-name"));
	  element.sendKeys("Jayaram");
	  
	  String actual = element.getAttribute("value");
	  String expected = "Jayram";
	  Assert.assertEquals(actual, expected);
			  
  }
	  
  
 @Test
 public void pass()
 {
	 WebElement pass = driver.findElement(By.id("password"));
	  pass.sendKeys("Jay"); 
	  
	  String actual = pass.getAttribute("value");
	  String expected = "Jay";
	 Assert.assertNotEquals(actual, expected);
	  
 }
  
 
 @Test
 public void login()
 {
	 WebElement login = driver.findElement(By.id("login-button"));
	  login.click();	  
 }
  
  @BeforeTest
  public void launch() 
  {
	  driver= new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
  }

  @AfterTest
  public void exit() 
  {
	  driver.close();
  }

  
}
