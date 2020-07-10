package TOOC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegisterUserNewCard extends BaseClass
{
	static int count=1;
	@Test(invocationCount = 30)
	public static void userLogin() throws Exception
	{
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		Thread.sleep(8000);
		
		//Email	
		driver.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='email']")).sendKeys("odahyalkar@kennovation-services.com");
		Thread.sleep(1000);
		//password
		driver.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']")).sendKeys("Omkar@123");
		Thread.sleep(1000);
		//sign in
		driver.findElement(By.xpath("//fieldset[@class='fieldset login']//button[@id='send2']")).click();
		Thread.sleep(18000);
		
		//product 
		  //WebElement CaliforniaBalsamico = driver.findElement(By.xpath("//a[contains(text(),'California Balsamico Bianco with Honey')]"));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,700)");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='summer_favorites_block clrb']//div[5]//div[1]//div[1]//div[1]//a[1]//img[1]"))).click().build().perform();
//		 action.moveToElement(CaliforniaBalsamico).perform();
//		  Thread.sleep(2000);
//		  CaliforniaBalsamico.click();
          Thread.sleep(5000);
		//count
		// js.executeScript("window.scrollby(0,300)");
		  driver.findElement(By.xpath("//div[@class='qty-button increase']")).click();
		  
		  //add cart
		  driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
		   Thread.sleep(20000);
		   
		   //cart
		 //  js.executeScript("window.scrollby(0,-200)");
		   WebElement cart = driver.findElement(By.xpath("//span[@class='label'][contains(text(),'Cart')]"));
		   action.moveToElement(cart).perform();
		   Thread.sleep(3000);
		   //view and edit cart
		   driver.findElement(By.xpath("//span[contains(text(),'View and Edit Cart')]")).click();
		  Thread.sleep(15000);
		  
		  //proceed to checkout 
		 
		  js.executeScript("window.scrollBy(0,500)");
		  driver.findElement(By.xpath("//li[@class='item']//button[@class='action primary checkout']")).click();
		  
//		  //Shipping address 
	      Thread.sleep(15000);
		 // driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		  
//		  //UPSGround
		  action.moveToElement(driver.findElement(By.xpath("//button[@class='action action-show-popup']"))).perform();
		  Thread.sleep(5000);
		  
		  js.executeScript("scroll(0,1000)");
		  Thread.sleep(2000);
		  js.executeScript("document.getElementById('label_method_03_ups').click()");
		  
		  
		  
	  Thread.sleep(5000);
	  //Next
	    
	       WebElement next = driver.findElement(By.xpath("//button[@class='button action continue primary']"));
	       js.executeScript("arguments[0].click()", next);
	  
	   Thread.sleep(25000); 
	   
	   js.executeScript("window.scrollTo(0,1000)");
	   
	   //new card
	  driver.findElement(By.xpath("//input[@id='custompayment']")).click();
	  // newCard number
	  driver.findElement(By.xpath("//input[@id='custompayment_cc_number']")).sendKeys("5555555555554444");
	  
	//date
	 	WebElement Expiration_Date = driver.findElement(By.xpath("//select[@id='custompayment_expiration']"));
	 	Select date = new Select(Expiration_Date);
	 	date.selectByIndex(8);
	 	Thread.sleep(1000);
	 	//year
		WebElement year= driver.findElement(By.xpath("//select[@id='custompayment_expiration_yr']"));
		Select yea= new Select(year);
		yea.selectByVisibleText("2020");
		Thread.sleep(2000);
		
		//card_varifivation
		driver.findElement(By.xpath("//input[@id='custompayment_cc_cid']")).sendKeys("123456");
		Thread.sleep(2000);
		 
		js.executeScript("window.scrollTo(0,500)");
		
		//place_Order
				driver.findElement(By.xpath("//div[@class='payment-method _active']//button[@class='action primary checkout']")).click();
				
				Thread.sleep(30000);
				String thankYouText = driver.findElement(By.xpath("//span[@class='base']")).getText();
				
			
				// int count =1;
				
				if(thankYouText.equalsIgnoreCase("Thank you for your purchase!"))
				{
					System.out.println("Thank you for your purchase! "+ count);
					count = count + 1;
					Thread.sleep(2000);
				    driver.findElement(By.xpath("//span[contains(text(),'Continue Shopping')]")).click();
				    Thread.sleep(20000);
				}
		     	else if(thankYouText.equalsIgnoreCase("Shopping Cart"))
		     	{	
					System.out.println(" Shopping Cart "+ count);
					count = count + 1;
		     		Thread.sleep(2000);
				    driver.findElement(By.xpath("//a[contains(text(),'here')]")).click();
				    Thread.sleep(20000);
		     	}
		
				 //sign out
				 driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
				 Thread.sleep(15000);
	}
	
}
