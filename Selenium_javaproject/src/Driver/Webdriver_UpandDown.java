package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webdriver_UpandDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		WebElement a = driver.findElement(By.id("twotabsearchtextbox"));
		a.sendKeys("Shoes");
		
		
		  // Actions class methods to select text
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND);
		act.sendKeys("a");
		act.keyUp(Keys.COMMAND);
		act.build().perform();
		
		  // Actions class methods to copy text
		act.keyDown(Keys.COMMAND);
		act.sendKeys("c");
		act.keyUp(Keys.COMMAND);
		act.build().perform();
		
		 // Action class methods to tab and reach to next input box
		
		act.sendKeys(Keys.TAB);
		act.build().perform();
		
		// Actions class methods to paste text
		
		act.keyDown(Keys.COMMAND);
		act.sendKeys("v");
		act.keyUp(Keys.COMMAND);
		act.build().perform();
		
		 // Identify the second input box
		
		WebElement s = driver.findElement(By.name("field-keywords"));
		
		 // Getting text in the second input box
		
		String text = s.getAttribute("value");
		System.out.println("Value copied and pasted: \" + text");
		
		
		
		
		
		
		
		
		
	}

}
