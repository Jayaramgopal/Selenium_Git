package Driver;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		WebElement a = driver.findElement(By.id("twotabsearchtextbox"));
		a.sendKeys("Shoes");
		
		  File f = new File("./Picture.png");
	      System.out.println("Getting the file path to be uploaded: " + f.getAbsolutePath());

	      // uploading file with path of file uploaded
	      a.sendKeys(f.getAbsolutePath());

	      // check if file uploaded successfully
	      if (a.getAttribute("value").equalsIgnoreCase("Picture.png")) {
	         System.out.println("File uploaded successfully ");
	      } else {
	         System.out.println("File uploaded unsuccessfully ");
	      }

	      // Closing browser
	      driver.quit();
	   }
	}


