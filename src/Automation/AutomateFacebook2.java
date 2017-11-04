package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateFacebook2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/tcs/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("email")).sendKeys("jesan.sivsan@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("Karthar");
		//driver.findElement(By.id("u_0_3")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Shashank");
		driver.findElement(By.name("lastname")).sendKeys("Shriram");
		driver.findElement(By.name("reg_email__")).sendKeys("9941556534");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Karthar");
		Select sel1 = new Select(driver.findElement(By.name("birthday_month")));
		sel1.selectByValue("10");
		Select sel2 = new Select(driver.findElement(By.name("birthday_day")));
		sel2.selectByIndex(31);
		Select sel3 = new Select(driver.findElement(By.name("birthday_year")));
		sel3.selectByValue("2015");
		driver.findElement(By.id("u_0_8")).click();

		driver.findElement(By.name("reg_passwd__")).clear();
		
		boolean sel = driver.findElement(By.name("sex")).isSelected();
		System.out.println("Sex select: "+sel );
		
		boolean enable = driver.findElement(By.name("websubmit")).isEnabled();
		System.out.println("Status of create account button enabling: " + enable);
		
		//boolean display =  driver.findElement(By.name("reg_passwd__")).isDisplayed();
		
		//System.out.println("Password Display: "+display);
		
		//driver.navigate().back();
		
		//driver.quit();
		
		
		
		

	}

}
