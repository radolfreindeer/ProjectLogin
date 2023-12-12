package SeleniumTesting;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;   

public class SeleniumLogin{

	  
			
	public static WebDriver driver; 
	String HomeURL = "https://outsized.com/";
	
	
	public SeleniumLogin() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\GuestUser\\Desktop\\ChromeDriver");				
		WebDriver driver = new ChromeDriver();
		driver.get("HomeURL");
		driver.manage().window().maximize();

	}
	
	@Test
	public void LoginPage()
	{
		 WebElement loginpage=driver.findElement(By.xpath(
		 "/html/body/header/div[2]/div/div[3]/a[1]")); loginpage.click(); WebElement
		 email=driver.findElement(By.id("email")); WebElement
		 password=driver.findElement(By.id("password")); WebElement
		 login=driver.findElement(By.xpath(
		 "//*[@id=\"__next\"]/div/div/div/div[2]/form/form/button[1]"));
		 email.sendKeys("rad.paari@gmail.com"); 
		 password.sendKeys("Password"); 
		 login.click();
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
	}



	

}
