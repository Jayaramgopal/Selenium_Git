package Testng_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Testng_priority {

	public WebDriver driver;
	
	@Test(priority=1)
	public void launch()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test(priority=2)
	public void verify()
	{
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("selenium");
		element.submit();
	}
	
	@Test(enabled=false)
	public void search()
	{
		WebElement search = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3"));
		search.click();
	}
	
	@AfterTest(description="close the driver")
	public void close()
	{
		driver.close();
	}
}

