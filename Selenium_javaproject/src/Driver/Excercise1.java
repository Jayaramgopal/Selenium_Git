package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excercise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(200);
		
		WebElement element = driver.findElement(By.id("firstName"));
		element.sendKeys("Jayaram");
		
		driver.findElement(By.id("lastName")).sendKeys("G");
		
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("jayaram@gmail.com");
		
		driver.findElement(By.className("custom-control-label")).click();
		
		driver.findElement(By.id("userNumber")).sendKeys("9677378162");
		
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]")).click();//
		
		//Driver.findElement(By.id("dateOfBirthInput")).sendKeys("21/1/1995");//
		
		WebElement text = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]"));
		text.sendKeys("testing");
		
		WebElement check = driver.findElement(By.className("custom-control-label"));
		check.click();
		
		WebElement address = driver.findElement(By.xpath("//*[@id='currentAddress']"));
		address.sendKeys("coimbatore");
		
		Select se = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[10]/div[2]/div/div")));
		se.selectByIndex(2);
		
		if(se.isMultiple())
		{
			System.out.println("yes its multiple");
			
		}
		else
			System.out.println("not a multiple ");
		
		Select sel = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[10]/div[2]/div/div")));
		sel.selectByIndex(1);
		
				
			
		
	}

}

