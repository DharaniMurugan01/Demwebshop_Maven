package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Helpclass;

public class Addtocardpage {
	public Addtocardpage(){
		PageFactory.initElements(Helpclass.driver, this);
	}
 @FindBy(xpath="//select[@name='products-orderby']")
 public WebElement sortby;
 @FindBy(xpath="//select[@name='products-pagesize']")
 public WebElement display;
 @FindBy(xpath="//select[@name='products-viewmode']")
 public WebElement view;
}
