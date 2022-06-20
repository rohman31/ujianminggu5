package com.juaracoding.ujianminggu5.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${email}")
	private String email;
	
	@Value("${password}")
	private String password;
	
	@Value("${txtWelcome}")
	private String txtWelcome;
	
	@Value("${quantity}")
	private String quantity;
	
	@Value("${txtProduk}")
	private String txtProduk;
	
	@Value("${txtDetail}")
	private String txtDetail;
	
	

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getTxtProduk() {
		return txtProduk;
	}

	public void setTxtProduk(String txtProduk) {
		this.txtProduk = txtProduk;
	}

	public String getTxtDetail() {
		return txtDetail;
	}

	public void setTxtDetail(String txtDetail) {
		this.txtDetail = txtDetail;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTxtWelcome() {
		return txtWelcome;
	}

	public void setTxtWelcome(String txtWelcome) {
		this.txtWelcome = txtWelcome;
	}
	
	
}
