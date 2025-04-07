package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utilities.Helpclass;

public class Logpage {
    public Logpage() {
        PageFactory.initElements(Helpclass.driver, this);
    }

    @FindBy(xpath = "//input[@name='Email']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement log;
}
