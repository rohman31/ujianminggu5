package com.juaracoding.ujianminggu5.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujianminggu5.driver.DriverSingleton;

public class BeliBaju {
	private WebDriver driver;
	
	public BeliBaju() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")
	private WebElement btnWomen;
	
	@FindBy(css = "#center_column > ul > li:nth-child(2) > div > div.left-block > div > a.product_img_link > img")
	private WebElement btnBajuWomen;
	
	@FindBy(id= "add_to_cart")
	private WebElement btnAdd;
	
	@FindBy(css = "#block_top_menu > ul > li:nth-child(2)")
	private WebElement btnDress;
	
	@FindBy(css = "#center_column > ul > li:nth-child(2) > div > div.left-block > div > a.product_img_link > img")
	private WebElement btnBajuDress;
	
	@FindBy(css = "#block_top_menu > ul > li:nth-child(3)")
	private WebElement btnTshirt;
	
	@FindBy(css = "#center_column > ul > li > div > div.left-block > div > a.product_img_link > img")
	private WebElement btnBajuTshirt;
	
	
	@FindBy(className = "product-name")
	private WebElement txtProduk;
	
	@FindBy(className = "quantity_wanted")
	private WebElement inputquantity;
	
	@FindBy(css= "#product > div > div > div.pb-center-column.col-xs-12.col-sm-4 > h1")
	private WebElement txtDetail;
	
	@FindBy(className= "fancybox-iframe")
	private WebElement bingkai;
	
	@FindBy(className= "fancybox-iframe")
	private WebElement bingkai1;
	
	@FindBy(className= "fancybox-iframe")
	private WebElement bingkai2;
	
	@FindBy(id= "add_to_cart")
	private WebElement btnAdd1;
	
	@FindBy(id= "add_to_cart")
	private WebElement btnAdd2;
	
	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
	private WebElement btnProses;
	
	@FindBy(className= "clearfix")
	private WebElement bing;
	
	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span")
	private WebElement btnContinue;
	
	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span")
	private WebElement btnContinue1;
	
	
	public void pilihBaju() {
		btnWomen.click();
//		txtWomen.getText();
		scroll(driver);
		btnBajuWomen.click();
		driver.switchTo().frame(bingkai);
//		inputquantity.clear();
//		inputquantity.sendKeys(quantity);
		btnAdd.click();
		driver.switchTo().defaultContent();
		btnContinue.click();
		btnDress.click();
		scroll(driver);
		btnBajuDress.click();
		driver.switchTo().frame(bingkai1);
		btnAdd1.click();
		driver.switchTo().defaultContent();
		btnContinue1.click();
		btnTshirt.click();
		scroll(driver);
		btnBajuTshirt.click();
		driver.switchTo().frame(bingkai2);

//		btnAdd.click();
//		btnCloseWomen.click();
	}
	
	public static void scroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,1000)");
	}

	public String geTxtProduk() {
		return txtProduk.getText();
	}
	
//	public String getTxtDetail() {
//		return txtDetail.getText();
//	}
}
