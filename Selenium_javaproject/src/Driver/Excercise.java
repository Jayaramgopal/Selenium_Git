package Driver;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Excercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(200);
		
		/* WebElement element = driver.findElement(By.id("name"));
		element.sendKeys("Jayaram");
		
		driver.findElement(By.id("email")).sendKeys("a@c.com");
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[1]/input[3]")).sendKeys("9677378162");
		
		driver.findElement(By.xpath("//*[@id='textarea']")).sendKeys("coimbatore");
		
		WebElement checkbox = driver.findElement(By.id("male"));
		checkbox.click();
		
		WebElement selectbox = driver.findElement(By.id("female"));
		selectbox.click();
		
		Select se = new Select(driver.findElement(By.id("country")));
			se.selectByVisibleText("France");
			
		List<WebElement> count = se.getOptions();
		//System.out.println(count);     (or)
		int dropdown_size = count.size();
		System.out.println(dropdown_size);
		
	/*	for(int i=0;i<dropdown_size;i++)
		{
			String text = count.get(i).getText();
			System.out.println("text");
		}*/
					
		//  (or) //
		
		/*for(WebElement check:count)
		{
			System.out.println(check.getText());
		}
		
		Select multiple = new Select(driver.findElement(By.id("colors")));
		multiple.selectByIndex(2);
		multiple.selectByIndex(4);
		multiple.selectByValue("white");
		multiple.selectByVisibleText("Yellow");
		
		// To identify the size of elements - number of counts
		
		List<WebElement> size1 = multiple.getOptions();
		System.out.println(size1.size());
		
		
		
		WebElement sel =multiple.getFirstSelectedOption();
		System.out.println(sel.getText());
		
		// To identify the selected options
		List<WebElement> value = multiple.getAllSelectedOptions();
		
		
		for(WebElement i: value)
		{
			System.out.println(i.getText());
		}
		
		boolean status = multiple.isMultiple();
		System.out.println(status);
		
		multiple.deselectByIndex(4); */

		//  Action class - drag and drop 
		
		/* WebElement tab = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		tab.sendKeys("testing");
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[1]/div[1]/form/div/span[2]/span[2]/input")).click(); 
		
		*/
		
		Actions action = new Actions(driver);
		
		//WebElement darg = driver.findElement(By.id("draggable"));//
		//WebElement drop = driver.findElement(By.id("droppable"));//
		
		//action.dragAndDrop(drop, darg).build().perform(); //
		
		// handling frame
		
		WebElement fram = driver.findElement(By.id("frame-one796456169"));
		driver.switchTo().frame(fram);
		
		driver.findElement(By.name("RESULT_TextField-0")).sendKeys("Jayaram");
		
		driver.findElement(By.xpath("//*[@id=\"q2\"]/table/tbody/tr[1]/td/label")).click();
		
		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("12/12/1992");
		
		
		
		Select se = new Select(driver.findElement(By.name("RESULT_RadioButton-3")));
		se.selectByIndex(2);
		
		driver.findElement(By.name("Submit")).click();
		
		driver.switchTo().defaultContent();
		
		WebElement resize = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[8]/div[1]/div/div[3]"));
		
		
		action.clickAndHold(resize).moveByOffset(100, 180).build().perform();
		
	
		
		
		
	}

}
