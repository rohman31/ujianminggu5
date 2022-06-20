package com.juaracoding.ujianminggu5.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements DriverStrategy {

	public WebDriver setStrategy() {
		System.setProperty("webdriver.chrome.driver", "/Users/rohman/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
}
