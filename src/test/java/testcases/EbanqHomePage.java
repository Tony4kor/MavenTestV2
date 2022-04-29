package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbanqHomePage {
	
	private WebDriver driver;
	
	 @FindBy(css = "[class='aside__label main_color accounts']") WebElement accountsLink;
	 @FindBy(css = "[class='aside__label main_color cards']") WebElement cardsLink;
	@FindBy (css = "[class='aside__label main_color transfer']") WebElement transfersLink;
	@FindBy (css = "[class='aside__label main_color reports']") WebElement reportsLink;
	@FindBy (css = "[class='aside__label main_color news']") WebElement newsLink;
	@FindBy (xpath = "(//div[@routerlink='/my-profile'])[2]") WebElement myProfileLink;
	
	
	
	
	
	public EbanqHomePage(WebDriver driver) {
		this.driver = driver; PageFactory.initElements(driver, this);
	}

}
