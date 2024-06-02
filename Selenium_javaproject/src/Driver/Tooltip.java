package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 WebDriver driver = new ChromeDriver();
		/* driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		
		WebElement fram = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/iframe"));
		driver.switchTo().frame(fram);
		
		WebElement tool = driver.findElement(By.id("age"));
		String txt = tool.getAttribute("title");
		System.out.println(txt); */
		
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		driver.manage().window().maximize();
		
		WebElement tip = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div[3]/div[1]/div"));
		
		WebElement top = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div[3]/div[1]/div/span"));
		
		Actions act = new Actions(driver);
		act.moveToElement(tip).perform();
		
		String tooltip = top.getText();
		System.out.println(tooltip);
		
		
		
		

	}

}
