package com.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pages.Checkoutpage;

public class Checkoutactions {
	WebDriver driver;
	Checkoutpage cp = new Checkoutpage();
  public void clickproduct() {
	  cp.addtocard.click();
  }
  public void filldetail(String string,String string2) {
	  cp.name.sendKeys(string);
	  cp.email.sendKeys(string2);
  }
  public void clickaddtocard() {
	  cp.addtocard1.click();
  }
  public void clickshopcard() {
	  cp.shopcard.click();
  }
  public void clickterms() {
	  cp.terms.click();
  }
  public void clickcheckout() {
	  cp.checkout.click();
  }
//  public void clickbilladdress1() {
//	  cp.continuee.click();
//  }
//  public void clickbilladdress2() {
//	  cp.paymethod.click();
//	  
//  }
//  public  void clickbilladdress21(){
//	  cp.paycontinue.click();
//  }
//  public void clickbilladdress3() {
//	  cp.infocontinue.click();
//  }
//  public void clickbilladdress4() {
//	  cp.confirm.click();
//  }
//  public void validorder(String expected) {
//	  String actual=cp.thank.getText();
//	  System.out.println(expected);
//	  System.out.println(actual);
//	  Assert.assertEquals(expected,actual);
//	  System.out.println("successfully order placed");
//  }
}
