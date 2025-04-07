package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.utilities.Helpclass;

public class Homepage {
	public Homepage() {
        PageFactory.initElements(Helpclass.driver, this);
    }
    @FindBy(xpath="(//li/a)[16]")
    public WebElement giftcard;
    @FindBy(xpath="//h1")
    public WebElement prodgiftcard;
}
