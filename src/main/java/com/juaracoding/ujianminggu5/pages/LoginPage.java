package com.juaracoding.ujianminggu5.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujianminggu5.driver.DriverSingleton;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement btnSignin;
	
	
	@FindBy(id = "email")
	private WebElement inputemail;
	
	@FindBy(id = "passwd")
	private WebElement inputpassword;
	
	@FindBy(id = "SubmitLogin")
	private WebElement Login;
	
	@FindBy(className = "account")
	private WebElement txtWelcome;
	
	public void loginForm(String email, String password) {
		btnSignin.click();
		scroll(driver);
		inputemail.sendKeys(email);
		inputpassword.sendKeys(password);
		tunggu();
		Login.click();
	}
	
	public String getTxtWelcome() {
		return txtWelcome.getText();
	}
	
	public static void scroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,1000)");
	}
	
	public static void tunggu() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
