package TOOC;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import lib.ActionFunctions;

public class WebsiteVisit extends BaseClass {

	@Test(invocationCount =1)
	public void walkthrough() throws Exception {

		WebElement shop = driver.findElement(By.xpath("//a[@class='level-top']//span[contains(text(),'Shop')]"));

		Actions action = new Actions(driver);

		action.moveToElement(shop).perform();

		action.moveToElement(driver.findElement(By.xpath(
				"//li[@class='nav-item level1 nav-1-1 first nav-item--only-subcategories parent']//a[contains(text(),'View All')]")))
				.click().build().perform();

		// ActionFunctions.clickByXpath(driver, "//li[@class='nav-item level1 nav-1-1
		// first nav-item--only-subcategories parent']//a[contains(text(),'View
		// All')]");

		Thread.sleep(15000);

		action.moveToElement(driver.findElement(By.xpath("//li[1]//div[1]//div[1]//a[1]//span[1]//span[1]//img[1]")))
				.perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//li[7]//div[1]//div[2]//strong[1]"))).perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Just Dip It!')]"))).perform();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement nextPage = driver.findElement(By.xpath("//a[contains(text(),'Fresh Blood Orange Olive Oil')]"));

		js.executeScript("arguments[0].scrollIntoView();", nextPage);

		nextPage.click();

		WebElement browseOurStore = driver.findElement(By.xpath("//h6[@class='block-title heading'][contains(text(),'Browse Our Store')]"));
		js.executeScript("arguments[0].scrollIntoView();", browseOurStore);

		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,-1000)");

		driver.findElement(By.xpath("//div[7]//div[2]//ul[1]//li[1]//a[1]")).click();

		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,800)");

		driver.findElement(By.xpath("//a[contains(text(),'Fresh Blood Orange Olive Oil')]")).click();
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//div[@class='qty-button increase']")).click();
		
		driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
		
		Thread.sleep(20000);
		
		action.moveToElement(driver.findElement(By.xpath("//span[@class='label'][contains(text(),'Cart')]"))).perform();
		
		Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'View and Edit Cart')]"))).click().build().perform();
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Remove item')]")).click();
		
		Thread.sleep(10000);
		
		String shoppingCart = driver.findElement(By.xpath("//span[@class='base']")).getText();
		
		Assert.assertEquals(shoppingCart, "Shopping Cart");
		
		
		action.moveToElement(driver.findElement(By.xpath("//span[@class='label'][contains(text(),'Cart')]"))).perform();
		
		String emptyCart = driver.findElement(By.xpath("//strong[@class='subtitle empty']")).getText();

		Assert.assertTrue(emptyCart.contains("You have no items in your shopping cart."), "CART IS NOT EMPTY ");
		
		driver.findElement(By.xpath("//a[@class='level-top']//span[contains(text(),'Shop')]")).click();
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		WebElement oliveOilSoaps = driver.findElement(By.xpath("//a[contains(text(),'Olive Oil Soaps')]"));
		js.executeScript("arguments[0].click()", oliveOilSoaps);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		WebElement dippingDishes = driver.findElement(By.xpath("//a[contains(text(),'Dipping Dishes')]"));
		js.executeScript("arguments[0].click()", dippingDishes);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		WebElement lipBalm = driver.findElement(By.xpath("//a[contains(text(),'Lip Balm')]"));
		js.executeScript("arguments[0].click()", lipBalm);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		WebElement liveOliveTrees = driver.findElement(By.xpath("//a[contains(text(),'Live Olive Trees')]"));
		js.executeScript("arguments[0].click()", liveOliveTrees);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		WebElement giftCard = driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]"));
		js.executeScript("arguments[0].click()", giftCard);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		WebElement shippingInfo = driver.findElement(By.xpath("//a[contains(text(),'Shipping Info')]"));
		js.executeScript("arguments[0].click()", shippingInfo);
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		WebElement help = driver.findElement(By.xpath("//a[contains(text(),'Help')]"));
		js.executeScript("arguments[0].click()", help);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		WebElement contactUs = driver.findElement(By.xpath("//ul[@class='bullet']//a[contains(text(),'Contact Us')]"));
		js.executeScript("arguments[0].click()", contactUs);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(500);
		
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Tasting Rooms')]"))).perform();
	//Testing room per work krna hai detail button per click nhi ho rha
		
		driver.findElement(By.xpath("//nav[@id='mainmenu']//span[contains(text(),'Temecula Olive Oil Company')]")).click();
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(500);
		
		WebElement ranchTour = driver.findElement(By.xpath("//span[contains(text(),'Ranch Tours')]"));
		action.moveToElement(ranchTour).perform();
		driver.findElement(By.xpath("//nav[@id='mainmenu']//span[contains(text(),'Book a Tour')]")).click();
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[@id='top']//div//div//div//div//div//div//div//div//a//img")).click();
		Thread.sleep(12000);
		
		
		
		
		
		
		
		
		 driver.close();
	}

}
