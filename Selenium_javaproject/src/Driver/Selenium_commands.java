package Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(200);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title); 
		
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.close();
		
		
		
		
		
		
		
	}

}
