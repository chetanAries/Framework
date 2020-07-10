package TOOC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Temecula extends BaseClass
{
	static Select sel ;
	int count = 1;
	
    @Test(invocationCount = 20)
	public void selectProduct() throws Exception
	{
    	
    	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	Actions act =  new Actions(driver);
    	act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'California Balsamico Bianco with Honey')]"))).click().build().perform();
    	//driver.findElement(By.xpath("//a[contains(text(),'California Balsamico Bianco with Honey')]")).click();
    	Thread.sleep(20000);
    	//quantity
    	driver.findElement(By.xpath("//div[@class='qty-button increase']")).click();
    	//add to cart
    	driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
    	Thread.sleep(20000);
    	
    	//cart
    	act.moveToElement(driver.findElement(By.xpath("//span[@class='label'][contains(text(),'Cart')]"))).perform();
    	 Thread.sleep(5000);
    	 
    	driver.findElement(By.xpath("//span[contains(text(),'View and Edit Cart')]")).click();
    	Thread.sleep(10000);
    	
    	//proceed to checkout
    	driver.findElement(By.xpath("//li[@class='item']//button[@class='action primary checkout']")).click();
    	Thread.sleep(20000);
    	
    	//Email Address
    	driver.findElement(By.xpath("//input[@id='customer-email']")).sendKeys("xyz@gmail.com");
    	Thread.sleep(10000);
    	//first name
    	driver.findElement(By.name("firstname")).sendKeys("Steve");
    	Thread.sleep(2000);
    	//last name 
    	driver.findElement(By.name("lastname")).sendKeys("Rogers"); 
    	Thread.sleep(2000);
    	//company
    	driver.findElement(By.name("company")).sendKeys("Temecula");
    	Thread.sleep(2000);
    	//street address 
    	driver.findElement(By.name("street[0]")).sendKeys("45 Cedar Street Baldwin Park, CA 91706");
    	Thread.sleep(2000);
    	//city
    	driver.findElement(By.name("city")).sendKeys("Los Angeles");
    	Thread.sleep(2000);
    	//state
    	 WebElement state = driver.findElement(By.name("region_id"));
    	 Select sel = new Select(state);
    	 sel.selectByIndex(12);
    	 Thread.sleep(2000);
    	     
    	//zip code
    	driver.findElement(By.name("postcode")).sendKeys("90002");
    	Thread.sleep(2000);
    	
    	//country 
    	WebElement countryName = driver.findElement(By.name("country_id"));
    	Select cName = new Select(countryName);
    	cName.selectByVisibleText("United States");
    	Thread.sleep(2000);
    	//phone_number
    	driver.findElement(By.name("telephone")).sendKeys("1234567891");
    	Thread.sleep(10000);
    	
    	//Shipping methods
    	WebElement upsGround = driver.findElement(By.xpath("//input[@name='ko_unique_5']"));
    	act.moveToElement(upsGround).perform();
    	Thread.sleep(1000);
    	upsGround.click();
    	Thread.sleep(5000);
    	
    	//next
    	driver.findElement(By.xpath("//button[@class='button action continue primary']")).click();
    	Thread.sleep(25000);
    	//newCreditCard
    	driver.findElement(By.xpath(" /html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[3]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[3]/div[1]/label[1]/span[1]")).click();
    	Thread.sleep(2000);
   
   
    //credit Card Number
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
		
	
//		Assert.assertEquals(thankYouText, "Thank you for your purchase!");
//		
//		Thread.sleep(2000);
//	    driver.findElement(By.xpath("//span[contains(text(),'Continue Shopping')]")).click();
//	    Thread.sleep(20000);
//    	
	}

  
	
	
}
