package Version1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class unitFramework {
	
	WebDriver rn;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//chromedriver_win32 (2)//chromedriver.exe");
	    rn=new ChromeDriver();
	    
	    rn.manage().window().maximize();
	    
	    rn.manage().deleteAllCookies();
	    
	   Thread.sleep(1000);
		
	}
	@Test
	public void test1() throws InterruptedException
	{
		rn.get("https://www.saucedemo.com/");
		
		rn.findElement(By.id("user-name")).sendKeys("standard_user");
		
		rn.findElement(By.id("password")).sendKeys("secret_sauce");
		
		rn.findElement(By.id("login-button")).click();
		
		Thread.sleep(1000);
	}
	
	@AfterMethod
	public void tearDonw()
	{
		rn.close();
	}
	
	
	
	
	
}
