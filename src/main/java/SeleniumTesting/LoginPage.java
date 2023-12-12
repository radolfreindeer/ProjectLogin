package SeleniumTesting;
	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertTrue;

	import java.util.List;

	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;   
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;   

	public class LoginPage {
		
		public String HomeURL = "https://outsized.com/";
			
		
		  @Before public void LoginPage() { //
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\GuestUser\\eclipse-workspace\\ProjectDemo\\src\\main\\java\\SeleniumTesting\\ChromeDriver\\chrome.exe"
		  ); WebDriver driver = new ChromeDriver();
		  driver.get("https://outsized.com/");
		  
		  }
		  
		 	
		  @Test public void Login() {
		  
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://outsized.com/"); 
		  
		  WebElement loginpage=driver.findElement(By.xpath(
		  "/html/body/header/div[2]/div/div[3]/a[1]")); loginpage.click(); WebElement
		  email=driver.findElement(By.id("email")); WebElement
		  password=driver.findElement(By.id("password")); WebElement
		  login=driver.findElement(By.xpath(
		  "//*[@id=\"__next\"]/div/div/div/div[2]/form/form/button[1]"));
		  email.sendKeys("rad.paari@gmail.com"); password.sendKeys("Password@123");
		  String title = driver.getTitle(); if(title!= null) {
		  System.out.println("Login Successful"); } driver.close(); }
		 	
		
		  @Test
		  public void Logout() {
			  

			  WebDriver driver = new ChromeDriver();
		   	driver.get("https://outsized.com/");
		      driver.manage().window().maximize();
			  WebElement loginpage = driver.findElement(By.xpath(
			  "/html/body/header/div[2]/div/div[3]/a[1]")); 
			  loginpage.click(); 
			//  driver.wait(0,1000);
			  WebElement email=driver.findElement(By.id("email")); 
			  WebElement
			  password=driver.findElement(By.id("password")); 
			  WebElement
			  login=driver.findElement(By.xpath(
			  "//*[@id=\"__next\"]/div/div/div/div[2]/form/form/button[1]"));
			  email.sendKeys("rad.paari@gmail.com"); 
			  password.sendKeys("Password@123");
			  login.click();
			  WebElement logout = driver.findElement(By.linkText("logout"));
			  logout.click();
			
			  String title = driver.getTitle();
				 if(title!= null) {
				
					 System.out.println("Login Successful"); }
			driver.close();
				 	
			  
		  }
			
			
			  @Test public void EmailIDIncorrect() {
			  
			  ChromeDriver driver = new ChromeDriver();
			  driver.get("https://outsized.com/"); WebElement
			  loginpage=driver.findElement(By.xpath(
			  "/html/body/header/div[2]/div/div[3]/a[1]")); loginpage.click(); WebElement
			  email=driver.findElement(By.id("email")); WebElement
			  password=driver.findElement(By.id("password")); WebElement
			  login=driver.findElement(By.xpath(
			  "//*[@id=\"__next\"]/div/div/div/div[2]/form/form/button[1]"));
			  email.sendKeys("standard_user"); password.sendKeys("secret_sauce");
			  driver.close();
			  
			  }
			  
			  
			  
			  @Test public void PasswordIncorrect() {
			  
			  WebDriver driver = new ChromeDriver(); driver.get("https://outsized.com/");
			  WebElement loginpage=driver.findElement(By.xpath(
			  "/html/body/header/div[2]/div/div[3]/a[1]")); loginpage.click(); WebElement
			  email=driver.findElement(By.id("email")); WebElement
			  password=driver.findElement(By.id("password")); WebElement
			  login=driver.findElement(By.xpath(
			  "//*[@id=\"__next\"]/div/div/div/div[2]/form/form/button[1]"));
			  email.sendKeys("rad.paari@gmail.com"); password.sendKeys("Password");
			  driver.close(); }
			  
			  
			  
			  @Test public void NullEmailPassowrd() {
			  
			  WebDriver driver = new ChromeDriver(); driver.get("https://outsized.com/");
			  WebElement loginpage=driver.findElement(By.xpath(
			  "/html/body/header/div[2]/div/div[3]/a[1]")); loginpage.click(); WebElement
			  email=driver.findElement(By.id("email")); WebElement
			  password=driver.findElement(By.id("password")); WebElement
			  login=driver.findElement(By.xpath(
			  "//*[@id=\"__next\"]/div/div/div/div[2]/form/form/button[1]"));
			  email.sendKeys("rad.paari@gmail.com"); password.sendKeys(""); login.click();
			  driver.close(); }
			  
			  @Test public void EmailIDValidations() {
			  
			  WebDriver driver = new ChromeDriver(); driver.get("https://outsized.com/");
			  WebElement loginpage=driver.findElement(By.xpath(
			  "/html/body/header/div[2]/div/div[3]/a[1]")); loginpage.click(); WebElement
			  email=driver.findElement(By.id("email")); WebElement
			  password=driver.findElement(By.id("password")); WebElement
			  login=driver.findElement(By.xpath(
			  "//*[@id=\"__next\"]/div/div/div/div[2]/form/form/button[1]"));
			  email.sendKeys("rad.paari@gmail.com"); password.sendKeys(""); login.click();
			  driver.close();
			  
			  }
			 			  
			  
			  
			  
			  
			 		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		
						
			
		}

	}


