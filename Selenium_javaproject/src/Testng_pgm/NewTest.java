package Testng_pgm;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	public WebDriver driver;
	
	
  @Test
  public void verify() 
  {
	  
	  WebElement search = driver.findElement(By.name("q"));
	  search.sendKeys("selenium");
	  search.submit();
  }
  
  @BeforeTest
  public void launch()
  {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/"); 
	  
  }

  @Test
  public void assertverify()
  {
	  String actual = driver.getCurrentUrl();
	  String expected = "https://www.google.com/";
	  Assert.assertEquals(actual, expected);
			  
  
  }
  
  @AfterTest
  public void end() 
  
 {
	  driver.close();
  }

}
