//package TOOC;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//import TOOC.temecula;
//
//public class paymentMethod extends temecula
//{
//@Test
//public static  void cardDetails() throws InterruptedException
//{
//	
//	//Credit Card Number
//	driver.findElement(By.xpath("//input[@id='custompayment_cc_number']")).sendKeys("5555555555554444");
//	Thread.sleep(2000);
//	//date
//	WebElement Expiration_Date = driver.findElement(By.xpath("//select[@id='custompayment_expiration']"));
//	Select sel = new Select(Expiration_Date);
//	sel.selectByIndex(8);
//	Thread.sleep(1000);
//	
//	//year
//	WebElement year= driver.findElement(By.xpath("//select[@id='custompayment_expiration_yr']"));
//	Select yea= new Select(year);
//	yea.deselectByVisibleText("2020");
//	Thread.sleep(2000);
//	
//	//card_varifivation
//	driver.findElement(By.xpath("//input[@id='custompayment_cc_cid']")).sendKeys("123456");
//	Thread.sleep(2000);
//	
//	//place_Order
//	driver.findElement(By.xpath("//div[@class='payment-method _active']//button[@class='action primary checkout']")).click();
//	
//}
//
//  
//	
//
//	
//}
//
//
