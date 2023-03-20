package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath="//span[text()='Courses']")private WebElement courses;
	@FindBy(xpath="//span[text()='Class 4']")private WebElement moveclass4;
	
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act=new Actions(driver);
	}
	
	public void clickonCourse() throws InterruptedException
	{
		Thread.sleep(2000);
		courses.click();
	}
	public void moveClass4AndClick() throws InterruptedException
	{
		Thread.sleep(2000);
		act.moveToElement(moveclass4).click().perform();
	}
	
	

}

