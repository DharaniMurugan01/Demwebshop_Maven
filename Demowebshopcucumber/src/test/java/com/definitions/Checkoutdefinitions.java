package com.definitions;
import com.actions.Checkoutactions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkoutdefinitions {
	Checkoutactions ca=new Checkoutactions();
	@Given("the user is on the products page")
	public void the_user_is_on_the_products_page() {
		
	}

	@When("the user clicks on a product")
	public void the_user_clicks_on_a_product() {
		ca.clickproduct();
	}

	@When("the user clicks the Add to Cart button")
	public void the_user_clicks_the_add_to_cart_button() {
		ca.clickaddtocard();
	}

	@When("the user enters {string} and {string}")
	public void the_user_enters_and(String string, String string2) {
		ca.filldetail(string,string2);
	}

	@Then("the product should be added to the cart successfully")
	public void the_product_should_be_added_to_the_cart_successfully() {
		
	}

	@When("the user clicks the shopping cart")
	public void the_user_clicks_the_shopping_cart() {
		ca.clickshopcard();
	}

	@When("the user agrees to the terms and conditions")
	public void the_user_agrees_to_the_terms_and_conditions() {
		ca.clickterms();
	}

	@Then("the user should be able to proceed to the checkout page")
	public void the_user_should_be_able_to_proceed_to_the_checkout_page() {
		ca.clickcheckout();
	}
//	@Then("the user should fill the billing Address")
//	public void the_user_should_fill_the_billing_address() {
//		ca.clickbilladdress1();
//		ca.clickbilladdress2();
//		ca.clickbilladdress21();
//		ca.clickbilladdress3();
//		ca.clickbilladdress4();	
//	}

//	@Then("the user should see the {string}")
//	public void the_user_should_see_the(String string) {
//		ca.validorder(string);
//	}
}
