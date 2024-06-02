package log4j;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4j_pgm {

	public static Logger Log = Logger.getLogger(log4j_pgm.class.getName());
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("D:\\exclipse\\Selenium_javaproject\\log4j.properties");
		
		WebDriver driver = new ChromeDriver();
		Log.info("driver launched");
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Log.info("URL launched");
		
		Thread.sleep(200);
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("selenium");
		element.submit();

		Log.info("search successfully");
		
		
		
		
		
		
	}

}
