package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Helpclass;

public class Checkoutpage {
	public Checkoutpage() {
        PageFactory.initElements(Helpclass.driver, this);
    }
  @FindBy(xpath="(//input[@value='Add to cart'])[1]")
  public WebElement addtocard;
  @FindBy(xpath="//input[@name='giftcard_1.RecipientName']")
  public WebElement name;
  @FindBy(xpath="//input[@class='recipient-email']")
  public WebElement email;
  @FindBy(xpath="//input[@id='add-to-cart-button-1']")
  public WebElement addtocard1;
  @FindBy(xpath="//span[text()='Shopping cart']")
  public WebElement shopcard;
  @FindBy(xpath="//input[@name='termsofservice']")
  public WebElement terms;
  @FindBy(xpath="//button[@name='checkout']")
  public WebElement checkout;
  
//  @FindBy(xpath="//input[@title='Continue']")
//  public WebElement continuee;
//  @FindBy(xpath="(//input[@name='paymentmethod'])[2]")
//  public WebElement paymethod;
//  @FindBy(xpath="//input[@class='button-1 payment-method-next-step-button']")
//  public WebElement paycontinue;
//  @FindBy(xpath="(//input[@type='button'])[4]")
//  public WebElement infocontinue;
//  @FindBy(xpath="(//input[@type='button'])[5]")
//  public WebElement confirm;
  @FindBy(xpath="//h1[text()='Thank you']")
  public WebElement thank;
}
