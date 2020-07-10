package TOOC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	@BeforeTest
	public void OpenBrowser() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chetan\\Desktop\\NewStartUpProject\\TOOC\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\chetan\\Desktop\\NewStartUpProject\\TOOC\\drivers\\geckodriver.exe");
////	
//	    driver = new FirefoxDriver();
//		 

		driver.manage().window().maximize();
		
//		driver.get("https://uat2.temeculaoliveoil.com/");
		driver.get("https://uat.temeculaoliveoil.com/");
//		driver.get("https://temeculaoliveoil.com/");
		Thread.sleep(6000);	

	}
	
//	@AfterTest
//	public void terminate()
//	{	
//		driver.close();
//	}

}

