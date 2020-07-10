package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionFunctions 
{
	static Actions action;
	static WebDriver driver;

	public static void moveToElement(WebDriver driver , String xpath)
	{
		 
	}
	
	public static void clickByXpath(WebDriver driver , String xpath)
	{
		
		action.moveToElement(driver.findElement(By.xpath(xpath))).click().build().perform();
	}
	
	
	
	
}
