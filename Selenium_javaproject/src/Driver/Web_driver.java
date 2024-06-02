package Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("mobile phone");
		element.submit();
		
		
	}

}
