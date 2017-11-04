import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KLMTicket {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/tcs/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.klm.com/home/nl/nl");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='est-search-homepage']/div[2]/div[2]/form/div/div[1]/label[2]/input")).sendKeys("maa");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> ddmenu = driver.findElements(By.xpath("//ul[@class='g-locationpicker-items']//li"));
		
		
		for (WebElement ele:ddmenu) {
			
			//WebElement element = ddmenu.get(i);
			
			String htmlvalues =  ele.getAttribute("innerHTML");
			
			System.out.println(htmlvalues);
			
			if (htmlvalues.contentEquals("Madras/Chennai - Chennai International Airport (<strong>MAA</strong>), India")) {
				
				ele.click();
				break;
				
			}
			
			
			
			
		}
		
		driver.findElement(By.xpath(".//*[@id='est-search-homepage']/div[2]/div[2]/div/div/div/button")).click();
		
		//List<WebElement> date = driver.findElements(By.xpath("//li[@class='g-datepicker-dates--day']//a"));
		
		//for (WebElement dateelements:date)
		//{
		//	date.
		
	//}
			
			
			
		}
	}	
	
