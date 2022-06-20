package com.juaracoding.ujianminggu5;

import static org.junit.Assert.assertEquals;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.ujianminggu5.config.AutomationFrameworkConfig;
import com.juaracoding.ujianminggu5.driver.DriverSingleton;
import com.juaracoding.ujianminggu5.pages.BeliBaju;
import com.juaracoding.ujianminggu5.pages.LoginPage;
import com.juaracoding.ujianminggu5.utils.ConfigurationProperties;
import com.juaracoding.ujianminggu5.utils.Constants;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinition {

	private static WebDriver driver;
	private LoginPage loginPage;
	private BeliBaju beliBaju;
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void setUp() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		loginPage = new LoginPage();
		beliBaju = new BeliBaju();
	}
	
//	@After
//	public void pilih() {
//		belibaju = new Belibaju();
//	}
	
	@AfterAll
	public static void quitDriver() {
		tunggu(5);
		driver.quit();
	}
	
	@Given("Customer mengakses url")
	public void customer_mengakses_url() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
	}
	
	@When("Customer login dengan username dan password")
	public void customer_login_dengan_username_password() {
		loginPage.loginForm(configurationProperties.getEmail(), configurationProperties.getPassword());
	}
	
	@Then("Customer berhasil login")
	public void customer_berhasil_login() {
//		driver.navigate().refresh();
		tunggu(2);
		assertEquals(configurationProperties.getTxtWelcome(), loginPage.getTxtWelcome());
	}
	
	@When("Customer menambah produk")
	public void customer_menambah_produk() {
//		driver.get(Constants.URL1);
		beliBaju.pilihBaju();
	}
	
	@Then("Customer berhasil menambah produk")
	public void customer_berhasil_menambah_produk() {
//		belibaju.pilihBaju(false);
		tunggu(2);
		assertEquals(configurationProperties.getTxtProduk(), beliBaju.geTxtProduk());
		
	}
	
//	@When("Customer melihat detail dari baju yang dipilih")
//	public void customer_melihat_detail_dari_baju_yang_dipilih() {
//		driver.get(Constants.URL2);
//		
//	}
//	
//	@Then("Custer berhasil masuk ke detail baju yang dipilih")
//	public void customer_berhasil_masuk_ke_detail_baju_yang_dipilih() {
////		belibaju.pilihBaju(false);
//		assertEquals(configurationProperties.getTxtDetail(), belibaju.getTxtDetail());
//	}
	
	public static void scroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,1000)");
	}
	
	public static void tunggu(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
