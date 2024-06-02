package Driver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();

		 TakesScreenshot screenshot = (TakesScreenshot)driver;
		 File source = screenshot.getScreenshotAs(OutputType.FILE);
		 File desn = new File("D://screen.png");
		 FileHandler.copy(source, desn);
		 
			 
		 
	}

}
