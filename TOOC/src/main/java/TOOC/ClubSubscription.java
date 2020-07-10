package TOOC;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;

public class ClubSubscription extends BaseClass
{
	int rows;		
	
//	@Test(dataProvider ="TOOC")
//    public void newUserRegistration(String firstName, String lastName, String email,String password , String confirmPassword) throws Exception
//    {
//		driver.findElement(By.xpath("//span[contains(text(),'Join the Club')]")).click();
//    	Thread.sleep(7000);
//    	
//    	JavascriptExecutor js = (JavascriptExecutor)driver;
//    	js.executeScript("window.scrollTo(0,1000)");
//    	
//    	driver.findElement(By.xpath("//a[contains(text(),'Simply Olive Oil Club')]")).click();
//    	Thread.sleep(5000);
//    	js.executeScript("window.scrollTo(0,500)");
//    	
//    	driver.findElement(By.xpath("//span[contains(text(),'Join this Club')]")).click();
//    	Thread.sleep(7000);
//    	
//    	driver.findElement(By.xpath("//main[@id='maincontent']//span[contains(text(),'Create an Account')]")).click();
//    	Thread.sleep(7000);
//		
//		
//    	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstName);
//    	
//    	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastName);
//    	driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys(email);
//    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//    	driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys(confirmPassword);
//     	Thread.sleep(7000);
//     	js.executeScript("window.scrollTo(0,500)");
//    	driver.findElement(By.xpath("//form[@id='form-validate']//span[contains(text(),'Create an Account')]")).click();
//    	 Thread.sleep(7000);
//    	 //after registration click on join the club
//    	 driver.findElement(By.xpath("//span[contains(text(),'Join the Club')]")).click();
//    	 Thread.sleep(10000);
//    	 //click on the SimpleOliveOilClub
//    	 js.executeScript("window.scrollTo(0,1000)");
//     	driver.findElement(By.xpath("//a[contains(text(),'Simply Olive Oil Club')]")).click();
//     	Thread.sleep(5000);
//     	//Subscription
//     	js.executeScript("window.scrollTo(0,300)");
//     	driver.findElement(By.xpath("//main[@id='maincontent']//label[1]")).click();
//     	//Delivery Type
//     	 WebElement Ups = driver.findElement(By.xpath("//select[@id='deliverytype']"));
//     	
//     	Select sel = new Select(Ups);
//     	sel.selectByIndex(2);
//     	Thread.sleep(2000);
//     	//join this club
//     	driver.findElement(By.xpath("//span[contains(text(),'Join this Club')]")).click();
//     	Thread.sleep(15000);
//     	driver.findElement(By.xpath("//span[contains(text(),'Add New Address')]")).click();
//    }
	
	
	@Test(dataProvider ="TOOC")
  public void newUserRegistration(String []args) throws Exception
  {
		
	driver.findElement(By.xpath("//span[contains(text(),'Join the Club')]")).click();
  	Thread.sleep(7000);
  	
  	JavascriptExecutor js = (JavascriptExecutor)driver;
  	js.executeScript("window.scrollTo(0,1000)");
  	
  	driver.findElement(By.xpath("//a[contains(text(),'Simply Olive Oil Club')]")).click();
  	Thread.sleep(5000);
  	js.executeScript("window.scrollTo(0,500)");
  	
  	driver.findElement(By.xpath("//span[contains(text(),'Join this Club')]")).click();
  	Thread.sleep(7000);
  	
  	driver.findElement(By.xpath("//main[@id='maincontent']//span[contains(text(),'Create an Account')]")).click();
  	Thread.sleep(7000);
		
		
  	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(args[0]);
  	
  	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(args[1]);
  	driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys(args[2]);
  	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(args[3]);
  	driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys(args[4]);
   	Thread.sleep(7000);
   	js.executeScript("window.scrollTo(0,500)");
  	driver.findElement(By.xpath("//form[@id='form-validate']//span[contains(text(),'Create an Account')]")).click();
  	 Thread.sleep(7000);
  	 //after registration click on join the club
  	 driver.findElement(By.xpath("//span[contains(text(),'Join the Club')]")).click();
  	 Thread.sleep(10000);
  	 //click on the SimpleOliveOilClub
  	 js.executeScript("window.scrollTo(0,1000)");
   	driver.findElement(By.xpath("//a[contains(text(),'Simply Olive Oil Club')]")).click();
   	Thread.sleep(5000);
   	//Subscription
   	js.executeScript("window.scrollTo(0,300)");
   	driver.findElement(By.xpath("//main[@id='maincontent']//label[1]")).click();
   	//Delivery Type
   	 WebElement Ups = driver.findElement(By.xpath("//select[@id='deliverytype']"));
   	
   	Select sel = new Select(Ups);
   	sel.selectByIndex(2);
   	Thread.sleep(2000);
   	//join this club
   	driver.findElement(By.xpath("//span[contains(text(),'Join this Club')]")).click();
   	Thread.sleep(15000);
   	driver.findElement(By.xpath("//span[contains(text(),'Add New Address')]")).click();
   	
   	driver.findElement(By.xpath("//input[@id='company']")).sendKeys(args[5]);
   	Thread.sleep(5000);
   	driver.findElement(By.xpath("//input[@id='telephone']")).sendKeys(args[6]);
   	Thread.sleep(5000);
   	js.executeScript("window.scrollTo(0,500)");
   	driver.findElement(By.xpath("//input[@id='street_1']")).sendKeys(args[7]);
   	Thread.sleep(5000);
   	driver.findElement(By.xpath("//input[@id='city']")).sendKeys(args[8]);
   	Thread.sleep(5000);
   	driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(args[9]);
   	Thread.sleep(2000);
   	driver.findElement(By.xpath("//select[@id='region_id']")).sendKeys(args[10]);
   	Thread.sleep(2000);
   	driver.findElement(By.xpath("//select[@id='country']")).sendKeys(args[11]);
   	Thread.sleep(2000);
   	driver.findElement(By.xpath("//form[@id='form-validate']//div//div//button")).click();
   	Thread.sleep(15000);
   	driver.findElement(By.xpath("//span[contains(text(),'Continue to Join Club')]")).click();
   	Thread.sleep(7000);
   	driver.findElement(By.xpath("//span[contains(text(),'Add New Payment Profile')]")).click();
   	
  }


    @DataProvider(name="TOOC")
    public Object[][] passData()
    {
    	ExcelDataConfig config= new ExcelDataConfig("C:\\Users\\chetan\\Desktop\\NewStartUpProject\\TOOC\\testData\\registerUserDetail.xlsx");
    	rows=config.getRowCount(0);
    	
    	Object[][] data= new Object[rows-1][12];
    	
    	for(int i=0; i<rows-1; i++)
    	{
    		data[i][0]=config.getData(0, i+1, 0);
    		data[i][1]=config.getData(0, i+1, 1);
    		data[i][2]=config.getData(0, i+1, 2);
    		data[i][3]=config.getData(0, i+1, 3);
    		data[i][4]=config.getData(0, i+1, 4);
    		data[i][5]=config.getData(0, i+1, 5);
    		data[i][6]=config.getData(0, i+1, 6);
    		data[i][7]=config.getData(0, i+1, 7);
    		data[i][8]=config.getData(0, i+1, 8);
    		data[i][9]=config.getData(0, i+1, 9);
    		data[i][10]=config.getData(0, i+1, 10);
    		data[i][11]=config.getData(0, i+1, 11);
    	}
    	
		return data;
    	
    }
    
    

    
    
}
