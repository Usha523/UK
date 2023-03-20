package testpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Class4Math;
import pages.HomePage;
import pages.LoginPage;

public class GoToNextVideo {
	
	private WebDriver driver;
	private LoginPage lp;
	private HomePage hp;
	private Class4Math c4;

	@BeforeClass
	public void launchBrowser() 
	{

		System.out.println("BeforeClass");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium2July\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
	}
	
	@BeforeMethod
	public void hiturl()
	{
		driver.get("https://www.khanacademy.org/login");
		
		
	}
	
	@Test
	public void verifyVideoPalaying() throws InterruptedException
	{
		lp=new LoginPage(driver);
//		lp.senduserName();
//		lp.sendPassword();
		lp.clickonLoginButton();
		
		hp=new HomePage(driver);
		hp.clickonCourse();
		hp.moveClass4AndClick();
		
		c4=new Class4Math(driver);
		c4.gotoaAdation();
		c4.gotoLink1();
		c4.button();
		c4.gotoUernamelogout();
		c4.clickLogoutButton();
		
		
	}
}

