package Version1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHelloWord {

	public static void main(String[] args) throws InterruptedException {
	
	System.out.println("Hello Word is successfully run on Eclipse Editor");
	
	System.setProperty("webdriver.chrome.driver","C://Users//chromedriver_win32 (2)//chromedriver.exe" );
	
	WebDriver rn=new ChromeDriver();
	
	rn.manage().window().maximize();
	
	rn.manage().deleteAllCookies();

	rn.get("https://www.saucedemo.com/");
	
	System.out.println(rn.getCurrentUrl());
	
	System.out.println(rn.getPageSource());
	
	rn.findElement(By.id("user-name")).sendKeys("standard_user");
	
	rn.findElement(By.id("password")).sendKeys("secret_sauce");
	
	rn.findElement(By.id("login-button")).click();
	
	System.out.println(rn.getTitle());	
	
	rn.findElement(By.id("react-burger-menu-btn")).click();
	
	rn.findElement(By.id("logout_sidebar_link")).clear();
	
	Thread.sleep(2000);
	
	rn.getTitle();
	
	rn.close();
	

	}

}
