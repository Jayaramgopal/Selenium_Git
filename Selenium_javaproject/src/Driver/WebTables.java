package Driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(200);
		
		// select date
		
		WebElement date = driver.findElement(By.id("datepicker"));
		date.click();
		
		driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[3]/td[4]/a")).click();	
		
		WebElement table = driver.findElement(By.name("BookTable"));
		
		List<WebElement> book_column= table.findElements(By.tagName("th"));
		System.out.println(book_column.size());
		
		List<WebElement> book_row = table.findElements(By.tagName("tr"));
		System.out.println(book_row.size());
		
		WebElement text = driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[4]/td[3]"));
		System.out.println(text.getText());
		
		WebElement checked = driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[3]/td[4]/input"));
		
		if(checked.isSelected())
		{
			System.out.println("yes its selected");
		}
			else
			{
				checked.click();
			}
		}
		
		
		
		
	}


