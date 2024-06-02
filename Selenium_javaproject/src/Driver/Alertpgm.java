package Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/?m=1");
		 driver.manage().window().maximize();
		 
		 WebElement element = driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]"));
		 element.click();
		 
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		
		 WebElement aler = driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[2]"));
		 aler.click();
		 
		 Thread.sleep(200);
		 
		 Alert alert1 = driver.switchTo().alert();
		 alert1.dismiss();
		 
		 WebElement alt = driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[3]"));
		 alt.click();
		 Thread.sleep(200);
		 
		 Alert alert2 = driver.switchTo().alert();
		 alert2.sendKeys("Jayaram");
		 alert2.accept();
		 
		 
	}

}
