package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		 WebDriver driver = new ChromeDriver();
		/* driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(400);
		 WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		 WebElement element1 = driver.findElement(By.xpath("//*[@id=\"nav_prefetch_yourorders\"]/span"));
		 
		 Actions action = new Actions(driver);
		 action.moveToElement(element).moveToElement(element1).click().perform();	*/
		 
		 // double click
		 
		 driver.get("https://testautomationpractice.blogspot.com/?m=1");
		 driver.manage().window().maximize();
		 
		// WebElement double_click = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[4]/div[1]/button"));//
		 
		 Actions action1 = new Actions(driver);
		 
	//	 action1.doubleClick().build().perform();//
		 
		 //  or  //
		 
		 action1.doubleClick(driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"))).perform();
		 
		 
		 
		 
		 // right click
		 
		 WebElement right_click = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		 
		 Actions action2 = new Actions(driver);
		 
		 action2.contextClick().build().perform();
		 
			
	}
}
