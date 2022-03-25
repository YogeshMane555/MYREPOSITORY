package Version1;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vwo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//chromedriver_win32 (2)//chromedriver.exe");
		
		WebDriver rn=new ChromeDriver();
		
		rn.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		rn.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		
		Thread.sleep(1000);
		
		Alert a= rn.switchTo().alert();		
		
		Thread.sleep(1000);
		
		a.accept();
		
		Thread.sleep(1000);
		
		WebElement Text=rn.findElement(By.id("result"));
		Text.getText();
		
		
		rn.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		
		Thread.sleep(1000);
		
		Alert a1=rn.switchTo().alert();
		
		Thread.sleep(1000);
		
		a1.dismiss();
		
		WebElement Text2 =rn.findElement(By.id("result"));
		Text2.getText();
		
		
		rn.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		
		Thread.sleep(1000);
		
		Alert a3=rn.switchTo().alert();
		
		a3.sendKeys("YOGESH MANE TEST MANAGER");
		
		a3.accept();
		
		WebElement Text3=rn.findElement(By.id("result"));
		 
		Text3.getText();
		
	
		
	
		
	}
		

	}

	
	

