package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DemoShopRegister {

	
	public WebDriver driver;
	
    private @FindBy(css = ".page-title") WebElement registerText;
    private @FindBy(css = "#gender-male") WebElement maleRadioBtn;
    private @FindBy(css = "#gender-female") WebElement femaleRadioBtn;
    private @FindBy(css  = "#FirstName") WebElement inputNameBox;
    private @FindBy(css = "#LastName") WebElement inputLastNameBox;
    private @FindBy(css = "#Email")WebElement inputEmailBox;
    private @FindBy(css = "#Password")WebElement inputPassBox;
    private @FindBy(css = "#ConfirmPassword")WebElement inputConfirmPassBox;
    private @FindBy(css = "#register-button")WebElement registerBtn;


    public DemoShopRegister(WebDriver driver1) {
    	 this.driver = driver1; PageFactory.initElements(driver, this);
    }
    
    public void verifyRegisterPage() {   	
		Assert.assertTrue(registerText.isDisplayed());
	}
    
    public void selectGendre(String gendre) {
		if (gendre.equalsIgnoreCase("Male")) {
			maleRadioBtn.click();
		}else {
			femaleRadioBtn.click();
		}
		
	}
}
