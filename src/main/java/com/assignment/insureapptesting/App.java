package com.assignment.insureapptesting;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	  WebDriverManager.chromedriver().setup(); 
    	  ChromeOptions chromeOptions = new ChromeOptions(); 
    	  chromeOptions.addArguments("--headless");
    	  
    	  WebDriver driver = new ChromeDriver(chromeOptions);
    	  
          System.out.println("Script is Executing");
    	  
          driver.get("http://localhost:8081/contact.html");
    	  System.out.println("Insure me app is opened");
    	  
    	  //System.out.println("Contact us is clicked");
    	  
    	  driver.findElement(By.id("inputName")).sendKeys("amitava");
    	  System.out.println("name is enetered");
    	  
    	  driver.findElement(By.id("inputNumber")).sendKeys("1232132131");
    	  System.out.println("number is enetered");
    	  
    	  driver.findElement(By.id("inputMail")).sendKeys("amitava@test.com");
    	  System.out.println("email is enetered");
    	  
    	  driver.findElement(By.id("inputMessage")).sendKeys("testing selenium insure me app");
    	  System.out.println("message entered");
    	  
    	  driver.findElement(By.id("my-button")).click();
    	  System.out.println("Send button clicked");
    	  
    	  assertEquals("Message Sent", driver.findElement(By.id("response")).getText());
    	  
    	  
	    
    	  Thread.sleep(1000);
    	  
    	  System.out.println("Got the response successfully"); Thread.sleep(1000); 
    }
}
