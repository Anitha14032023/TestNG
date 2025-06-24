package com.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;
import com.interfaceElements.SearchInterfaceElements;

public class SearchPageModel extends Baseclass implements SearchInterfaceElements{
	
	@FindBy(xpath = men_xpath)
	private WebElement men;
	
	@FindBy(xpath = jacket_xpath)
	private WebElement jacket;
	
	@FindBy(xpath = montana_xpath)
	private WebElement montana;
	
	@FindBy(xpath = size_xpath)
	private WebElement size;
	
	@FindBy(xpath = color_xpath)
	private WebElement color;
	
	@FindBy(xpath = addtocart_xpath)
	private WebElement addtocart;
	
	@FindBy(xpath = cart_xpath)
	private WebElement cart;
	
	@FindBy(xpath = checkout_xpath)
	private WebElement checkout;
	
	//@FindBy(xpath = next_xpath)
	//private WebElement next;
	
	public SearchPageModel() {
		 
		 PageFactory.initElements(driver, this);
		
	}
	
	public void getvalidsearch() {
		
		elementClick(men);
		elementClick(jacket);
		elementClick(montana);
		elementClick(size);
		elementClick(color);
		elementClick(addtocart);
        elementClick(cart);
        elementClick(checkout);
        //elementClick(next);
	}
}
