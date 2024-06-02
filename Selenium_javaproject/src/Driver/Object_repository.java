package Driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Object_repository {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f1 = new File("D:\\exclipse\\Selenium_javaproject\\src\\Driver\\or.properties");
		FileInputStream f = new FileInputStream(f1);
		Properties pro = new Properties();
		pro.load(f);
		
		WebDriver driver = new ChromeDriver();
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath(pro.getProperty("search")));
		search.sendKeys(pro.getProperty("valu"));
		search.submit();
		
		WebElement link= driver.findElement(By.xpath(pro.getProperty("selenium_link")));
		link.click();
		
		
	}

}
