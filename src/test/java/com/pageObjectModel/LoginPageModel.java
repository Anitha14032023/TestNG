package com.pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;
import com.interfaceElements.LoginPageInterfaceElements;
import com.utility.FileReaderManager;

public class LoginPageModel extends Baseclass implements LoginPageInterfaceElements {

	@FindBy(xpath = homePage_Xpath)
	private WebElement homepageSignIn;

	@FindBy(id = email_id)
	private WebElement email;
	
	@FindBy(xpath = password_xpath)
	private WebElement password;
	
	@FindBy(xpath = SignIn_xpath)
	private WebElement signin;
	
	 public LoginPageModel() {
		 
		 PageFactory.initElements(driver, this);
		
	}
	

	public void getValidLogin() throws IOException {
		
		FileReaderManager data  =  new FileReaderManager();

		elementClick(homepageSignIn);
		inputPassing(email,data.getDataProperty("Email"));
		inputPassing(password,data.getDataProperty("Password"));
		elementClick(signin);

	}

	
}