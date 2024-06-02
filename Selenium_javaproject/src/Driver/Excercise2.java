package Driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Excercise2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
	/*	driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(200);
		
		WebElement element = driver.findElement(By.id("name"));
		element.sendKeys("jay");
		
		driver.findElement(By.id("email")).sendKeys("a@c.com");
		
		driver.findElement(By.id("gender")).click();
		
		driver.findElement(By.name("mobile")).sendKeys("12345");
		
		driver.findElement(By.id("subjects")).sendKeys("English");
		
		driver.findElement(By.name("dob")).click();
		
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[9]/div/textarea")).sendKeys("coimbatore");
			
		Select se = new Select(driver.findElement(By.name("state")));
		se.selectByIndex(2);
		
		List<WebElement> count = se.getOptions();
		System.out.println(count);	
		
		for(WebElement i : count )
		{
			System.out.println(i.getText());
		}
		
		Select sel = new Select(driver.findElement(By.id("city")));
		sel.selectByVisibleText("Lucknow");
		sel.selectByValue("Agra");
		
		
		
		sel.deselectAll(); */
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
		driver.manage().window().maximize();		
		Actions action = new Actions(driver);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(drag, drop).build().perform();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/dragabble.php");
		
		WebElement draggable = driver.findElement(By.id("draggables"));
		action.dragAndDropBy(draggable, 100, 100).build().perform();
		
		
		
		
		
		}

}
