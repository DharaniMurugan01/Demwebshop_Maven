package com.actions;
import org.testng.Assert;

import com.pages.Homepage;

public class Homepageaction {
	Homepage hp=new Homepage();
  public void clickgift() {
	  hp.giftcard.click();	  
  }
  public void checkgiftassert(String string) {
	  String k=hp.prodgiftcard.getText();
	  Assert.assertEquals(k,string);
	  System.out.println("Assert the product page");
  }
}
