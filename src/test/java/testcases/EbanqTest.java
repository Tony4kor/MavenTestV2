package testcases;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.demowebshop.step_definitions.BaseClass2;

public class EbanqTest extends BaseClass2{
	
	
	
	@Test
	public void logInTest() throws InterruptedException {
		EbanqHomePage ebanqHomePage = new EbanqHomePage(driver);
		EbanqLogInPage ebanq = new EbanqLogInPage(driver);
		driver.get("https://demo.ebanq.com/log-in");
		driver.manage().window().setPosition(new Point(1800, 0));
		driver.manage().window().maximize();
		ebanq.enterUserName("Demo-User");
		ebanq.enterPass("Demo-Access1");
		ebanq.singInBtn.click();
		ebanqHomePage.accountsLink.click();
		ebanqHomePage.cardsLink.click();
		ebanqHomePage.transfersLink.click();
		ebanqHomePage.reportsLink.click();
		ebanqHomePage.newsLink.click();
		ebanqHomePage.myProfileLink.click();
		
	}

}
