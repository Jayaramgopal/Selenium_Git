package Driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
	driver.manage().window().maximize();
	
	List<WebElement> total = driver.findElements(By.tagName("iframe"));
	System.out.println(total.size());
	
	WebElement frames = driver.findElement(By.className("header selenium bg-white p-3 "));
	driver.switchTo().frame(frames);
	
	driver.switchTo().frame(1);
		
	}

}
