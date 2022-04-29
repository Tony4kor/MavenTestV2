package com.demowebshop.step_definitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.DemoShopHomePage;
import pageObjects.DemoShopRegister;
import pageObjects.Login;


public class Registration extends BaseClass2{

	public DemoShopHomePage homePage;
	public Login login;
	public DemoShopRegister register;
	
	
	
	@Given("User launches DemoShop")
	public void user_launches_demo_shop_home_page() {
		homePage = new DemoShopHomePage(driver);
		register = new DemoShopRegister(driver);
		login = new Login(driver);
		homePage.launch();
	  
	}

	@When("User clicks on register link")
	public void user_clicks_on_register_link() {
		homePage.clickRegister();
	   
	}

	@Then("User in registration page")
	public void user_in_registration_page() {
		register.verifyRegisterPage();
	}
}
