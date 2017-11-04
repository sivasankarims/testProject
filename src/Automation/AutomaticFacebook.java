package Automation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.platform.FileUtils;
//import org.openqa.selenium.safari.SafariDriver;


public class AutomaticFacebook {

		public static void main(String[] args)  throws Exception  {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "/Users/tcs/Downloads/chromedriver");		
		WebDriver driver = new ChromeDriver();
		
		
		//driver.get("https://www.facebook.com/");
		
		//driver.findElements(By.name("email"))).sendKeys("jesan.sivsan@gmail.com"));
		
		
		driver.get("http://www.google.com");
	
	driver.findElement(By.name("q")).sendKeys("download java");
	
	Thread.sleep(2000);
		
		driver.findElement(By.name("btnK")).click();
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	File source = ts.getScreenshotAs(OutputType.FILE);
	
    org.apache.commons.io.FileUtils.copyFile(source, new File("/Users/tcs/Dowlaods/Desktop/Snapshoot.png"));
    
    driver.quit();

	}

}
