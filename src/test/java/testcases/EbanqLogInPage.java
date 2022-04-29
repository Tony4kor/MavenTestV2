package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbanqLogInPage{

	private WebDriver driver;
	
	private @FindBy(xpath = "//input[@ng-reflect-name=\'email\']") WebElement userNameBox;
	private @FindBy(xpath = "//input[@ng-reflect-name='password']") WebElement passWordBox;
	@FindBy (css = "[class='controls__submit def-btn-success main_color']") WebElement singInBtn;
	
	
	
	public EbanqLogInPage(WebDriver driver) {
		this.driver = driver; PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String username) {
		userNameBox.sendKeys(username);
	}
	
	public void enterPass(String pass) {
		passWordBox.sendKeys(pass);
	}
}
