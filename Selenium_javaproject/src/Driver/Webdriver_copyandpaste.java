package Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_copyandpaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		WebElement a = driver.findElement(By.id("twotabsearchtextbox"));
		a.sendKeys("Shoes");
		
		WebElement s = driver.findElement(By.name("field-keywords"));
		
		a.sendKeys(Keys.CONTROL, "a");
		a.sendKeys(Keys.CONTROL, "c");
		
		s.sendKeys(Keys.CONTROL, "v");
		
		

	}

}
