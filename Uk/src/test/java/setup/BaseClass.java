package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	//Browser Related Code
	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium2July\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
		
	}

}
