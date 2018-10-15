package Cucumber_Selenium.Cucumber_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.model.Test;

public class plivo_assignment {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		selenium method = new selenium();
		method.setup();
		WebDriver driver = new ChromeDriver();
		
		//Hitting the Url and clicking the create app
		
		method.getUrl("http://quickfuseapps.com/", driver);
		method.maximise(driver);
		method.Click("link-create", "id", driver);
		method.waitsec(2000);
		
		//Selecting the lets get started and progressing upto module 3
		
		method.Click("//*[@id=\"intro-dialog-cont\"]/div[2]/button", "xpath", driver);
		method.Click("add-page", "id", driver);
		method.sendKeys("[class=\"indented submitonenter\"]", "cssSelector","test", driver);
		method.waitsec(2000);
		method.Click("/html/body/div[20]/div[3]/button[1]", "xpath", driver);
		method.Click("//*[@id=\"accordion\"]/h3[4]", "xpath", driver);
		method.waitsec(2000);
		method.Click("//*[@id=\"accordion\"]/div[4]/ul/li[3]/a/span", "xpath", driver);
		method.waitsec(2000);
		method.dragdrop("#module-1 .mod-south div", "#module-2 .mod-north div", "cssSelector", driver);
		method.sendKeys("//*[@id=\"module-2\"]/div[1]/div[3]/div/div[1]/div[2]/textarea", "xpath", "456878", driver);
		method.sendKeys("//*[@id=\"module-2\"]/div[1]/div[3]/div/div[2]/div/table/tbody/tr/td[1]/div/textarea", "xpath", "hi", driver);
		method.waitsec(2000);
		method.Click("//*[@id=\"accordion\"]/div[4]/ul/li[2]/a/span", "xpath", driver);
		method.waitsec(2000); 
		method.dragmove("//*[@id=\"module-3\"]/div[1]/div[3]/div/div[1]/div[4]/div[1]", "xpath", 100, 150, driver); 
		method.dragdrop("#module-2 .panel-nodes-attached div:nth-of-type(2)", "#module-3 .mod-north div", "cssSelector", driver); 
	    
		//send an email 
		
		method.sendKeys("//*[@id=\"module-3\"]/div[1]/div[3]/div/div[1]/div[1]/div[2]/input", "xpath", "smtp", driver);
	    method.sendKeys("//*[@id=\"module-3\"]/div[1]/div[3]/div/div[1]/div[2]/div[2]/input", "xpath", "89", driver);
	    method.sendKeys("//*[@id=\"module-3\"]/div[1]/div[3]/div/div[1]/div[3]/div[2]/input", "xpath", "username", driver);
	    method.sendKeys("//*[@id=\"module-3\"]/div[1]/div[3]/div/div[1]/div[4]/div[2]/input", "xpath", "password", driver);
	    method.sendKeys("//*[@id=\"module-3\"]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/textarea", "xpath", "from", driver);
	    method.sendKeys("//*[@id=\"module-3\"]/div[1]/div[3]/div/div[2]/div[2]/div[2]/div/textarea", "xpath", "to ", driver);
	    method.sendKeys("//*[@id=\"module-3\"]/div[1]/div[3]/div/div[2]/div[3]/div[2]/div/textarea", "xpath", "subject", driver);
	    method.sendKeys("//*[@id=\"module-3\"]/div[1]/div[3]/div/div[2]/div[4]/div[2]/div/textarea", "xpath", "cc", driver);
	    method.sendKeys("//*[@id=\"module-3\"]/div[1]/div[3]/div/div[3]/div/div/table/tbody/tr/td[1]/div/textarea", "xpath", "message", driver);
	    
	    //Clicking exit and basic
	    
	    method.Click("//*[@id=\"accordion\"]/h3[1]", "xpath", driver);
	    method.Click("//*[@id=\"accordion\"]/div[1]/ul/li[1]/a/span", "xpath", driver);
	    method.waitsec(2000);
		method.dragmove("//*[@id=\"module-4\"]/div[1]", "xpath", -150, 0, driver); 
		
		//Joining sent sms to exit
		
		method.dragdrop("#module-2 .panel-nodes-attached div:nth-of-type(1)", "#module-4 .mod-north div", "cssSelector", driver);
		
		//Clicking again exit
		
		method.Click("//*[@id=\"accordion\"]/div[1]/ul/li[1]/a/span", "xpath", driver);
		
	    //joining not sent to exit
		
		method.waitsec(2000);
		method.dragmove("//*[@id=\"module-5\"]/div[1]", "xpath", 400, 0, driver); 
		method.dragdrop("#module-3 .panel-nodes-attached div:nth-of-type(2)", "#module-5 .mod-north div", "cssSelector", driver);
		
		//Clicking again exit
		
		method.Click("//*[@id=\"accordion\"]/div[1]/ul/li[1]/a/span", "xpath", driver);
		
		//joining sent mail to exit
		method.dragdrop("#module-3 .panel-nodes-attached div:nth-of-type(1)", "#module-6 .mod-north div", "cssSelector", driver);
		
		//closing the browser
		method.closebrowser(driver);
	}
	

}
