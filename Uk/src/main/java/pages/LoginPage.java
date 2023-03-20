package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='uid-login-form-0-wb-id-identifier-field']")private WebElement username;
	

	@FindBy(xpath="//input[@id='uid-labeled-text-field-1-wb-id-field']")private WebElement password;
	

	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void senduserName(String name)
	{
		username.sendKeys(name);
	}
	
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickonLoginButton()
	{
		login.click();
	}
	
	

}
