
package Cucumber_Selenium.Cucumber_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class selenium { 
	

	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hasher\\Documents\\chromedriver.exe");
	}
	
	public void getUrl(String data, WebDriver driver)
	{
		driver.get(data);
	}
	
	public WebElement getElement (String locator,String locatorType, WebDriver driver)
	{
		return this.getElement (locator, locatorType, driver, 0);
	}
	
	public WebElement getElement (String locator,String locatorType, WebDriver driver, int num)
	{
		
	
		try {	
			
			if(locatorType == "id")
			{
			System.out.println(locator);
			WebElement element = driver.findElement(By.id(locator));
			return element;
			}
			else if(locatorType == "class")
			{
			WebElement element = driver.findElement(By.className(locator));
			return element;
			}
			else if(locatorType == "xpath")
			{
			WebElement element = driver.findElement(By.xpath(locator));
			return element;
			}
			else if(locatorType == "cssSelector")
			{
			WebElement element = driver.findElement(By.cssSelector(locator));
			return element;
			}
		}
		catch(Exception e){
		
			System.out.println(e.getMessage());
		}
		
		WebElement data = null;
		return data;
		
	}
	
	public void Click (String locator,String locatorType, WebDriver driver)
	{
		
		getElement(locator,locatorType, driver).click();	
	}
	
	public void sendKeys (String locator,String locatorType, String data, WebDriver driver)
	{
		getElement(locator,locatorType, driver).sendKeys(data);
	}
	
	public void dropdown (String locator,String locatorType, WebDriver driver,Integer k) {
		
	}
	
	public void waitsec(int data) throws InterruptedException
	{
		Thread.sleep(data);
	}
	
	public void dragdrop(String drag, String drop, String locatorType, WebDriver driver )
	{
		Actions act=new Actions(driver);
		if(locatorType == "xpath")
		{
		WebElement dra=driver.findElement(By.xpath(drag));
		WebElement dro=driver.findElement(By.xpath(drop));
		act.dragAndDrop(dra, dro).build().perform();
		}
		else if(locatorType == "id")
		{
		WebElement dra=driver.findElement(By.id(drag));
		WebElement dro=driver.findElement(By.id(drop));
		act.dragAndDrop(dra, dro).build().perform();
		}
		else if(locatorType == "class")
		{
		WebElement dra=driver.findElement(By.className(drag));
		WebElement dro=driver.findElement(By.className(drop));
		act.dragAndDrop(dra, dro).build().perform();
		}
		else if(locatorType == "cssSelector")
		{
		WebElement dra=driver.findElement(By.cssSelector(drag));
		WebElement dro=driver.findElement(By.cssSelector(drop));
		act.dragAndDrop(dra, dro).build().perform();		
			
		}
			
	}
		
	public void dragmove(String locator, String locatorType, int x, int y, WebDriver driver)
	{
		WebElement slider = driver.findElement(By.xpath(locator)); 
		 
	    Actions action= new Actions(driver);
	    action.clickAndHold(slider);
	    action.moveToElement(slider, x, y);
	    action.release().build().perform(); 
	}
	
	public void maximise(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void closebrowser(WebDriver driver)
	{
		driver.close();
	}
	
}
