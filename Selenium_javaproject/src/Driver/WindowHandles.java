package Driver;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		 element.sendKeys("mobiles");
		 element.submit();
		 
		 driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		 Set<String> S = driver.getWindowHandles();
		 ArrayList<String> ar = new ArrayList<String>(S);
		 driver.switchTo().window(ar.get(1));
		 
		 driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).click();
		 
		 driver.switchTo().window(ar.get(0));
		 
		 
		 
		 
	}

}
