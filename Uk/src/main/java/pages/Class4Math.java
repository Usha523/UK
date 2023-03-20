package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Class4Math {
	
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath="//a[text()='3-digit addition']")private WebElement addition;
	
	@FindBy(xpath="	(//a[contains(@class, '_1qwvhpzm')])[1]")private WebElement link1;
	
	@FindBy(xpath="//a[@role='button']")private WebElement nextvide;
	
	@FindBy(xpath="//button[@aria-label='ushakalpande523']")private WebElement gotousername;
	
	@FindBy(xpath="//span[text()='Log out']")private WebElement logout;

	
	public Class4Math(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act=new Actions(driver);
	}
	
	public void gotoaAdation() throws InterruptedException
	{
		Thread.sleep(2000);
		addition.click();
	}
	
	public void gotoLink1() throws InterruptedException
	{
		Thread.sleep(2000);
		link1.click();
	}
	public void button() throws InterruptedException
	{
		Thread.sleep(2000);
		nextvide.click();
	}

	public void gotoUernamelogout() throws InterruptedException
	{
		Thread.sleep(2000);
		act.moveToElement(gotousername).click().perform();
	}

	public void clickLogoutButton() throws InterruptedException
	{
		Thread.sleep(2000);
		act.moveToElement(logout).click().perform();
	}

}
