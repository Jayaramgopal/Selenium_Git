package Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(200);
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]/div/div/div/div/img"));
		search.click();
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Electronics");
		element.submit();
		
		/*WebElement find = driver.findElement(By.linkText("Electronics"));
		find.click();
		
		WebElement partial = driver.findElement(By.partialLinkText("Offer"));
		partial.click();
		
		WebElement classn = driver.findElement(By.className("_4WELSP"));
		classn.click();*/
		
		
		
		
		
		
		
		
		
		/*WebElement xpath = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		xpath.click();
		
		driver.navigate().back();*/
		
		
		
		
	}

}
