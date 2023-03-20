package testpkg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.Class4Math;
import pages.HomePage;
import pages.LoginPage;
import setup.BaseClass;
import utils.Uitility;

public class FinalTestClass extends BaseClass{
	private WebDriver driver;
	private LoginPage lp;
	private HomePage hp;
	private Class4Math c4;
	
	private int testID;
	
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browserchrome)
	{
		reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		if(browserchrome.equals("Chrome"))
		{
			driver=openChromeBrowser();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void createpomClassObject() throws EncryptedDocumentException, IOException
	{
		
		lp=new LoginPage(driver);
		
//		String data =Uitility.getDataFromExcelSheet("Sheet3", 7, 0);
//		lp.senduserName(data);
//		
//		data =Uitility.getDataFromExcelSheet("Sheet3", 7, 1);
//		lp.sendPassword(data);
		hp=new HomePage(driver);
		c4=new Class4Math(driver);	
	}
	
	
	@BeforeMethod
	public void videoPage() throws EncryptedDocumentException, IOException
	{
		driver.get("https://www.khanacademy.org/login");
		String data =Uitility.getDataFromExcelSheet("UtilsClass", 1, 0);
		lp.senduserName(data);
		
		data =Uitility.getDataFromExcelSheet("UtilsClass", 1, 1);
		lp.sendPassword(data);
		System.out.println("Repeated Method");
		
	}
	
	@Test
	public void clickonVideoTAb() throws InterruptedException
	{
//		lp.senduserName();
//		lp.sendPassword();
		lp.clickonLoginButton();
		
		
		hp.clickonCourse();
		hp.moveClass4AndClick();
		
		
		c4.gotoaAdation();
		c4.gotoLink1();
		c4.button();
		c4.gotoUernamelogout();
		c4.clickLogoutButton();
	}
	@AfterMethod
	public void applicationlogout(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Uitility.captureScreen(testID, driver);
		}
		
	}
	
	@AfterClass
	public void clearObject()
	{
		lp = null;
		hp =null;
		c4 = null;
	}
	
//	@AfterTest
//	public void closebrowser()
//	{
//		driver.close();
//		driver=null;
//		System.gc();
//	}

}
