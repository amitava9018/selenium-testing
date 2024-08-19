package com.assignment.insureapptesting;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    	  
          driver.manage().window().maximize(); 
          driver.get("http://54.147.57.60:8081/contact.html");
          System.out.println("MEDICURE Site opened");
          
          WebElement username = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[1]/div/input"));
          username.sendKeys("testMedicure");
          System.out.println("username entered");
          
          WebElement phoneNumber = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[2]/div/input"));
          phoneNumber.sendKeys("1232342345");
          System.out.println("password entered");
          
          WebElement email = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[2]/input"));
          email.sendKeys("testmed@med.com");
          System.out.println("email entered");
          
          WebElement messageStr = driver.findElement(By.className("message-box"));
          messageStr.sendKeys("testing medicure app");
          System.out.println("message entered");
          
          //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          WebElement sendButton = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[4]/button"));
          sendButton.click();
          System.out.println("Log in button clicked");
          
          assertEquals("Email sent.", driver.findElement(By.id("message")).getText());

          driver.quit();
          System.out.println("script executed successfully");
    }
}
