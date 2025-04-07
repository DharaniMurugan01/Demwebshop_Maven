package com.definitions;
import com.actions.Homepageaction;
import com.actions.Loginpageaction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Loginpagedefinitions {
	public static final Logger log=LogManager.getLogger(Loginpagedefinitions.class);
	Loginpageaction lpa=new Loginpageaction();
	Homepageaction hp=new Homepageaction();
	@Given("I am on the Demowebshop login page")
	public void i_am_on_the_demowebshop_login_page() {
		log.info("welcome");
	}
	@When("the user enter {string} and {string}")
	public void the_user_enter_and(String string, String string2) {
	 lpa.Login(string, string2);
	}
	@Then("the user should able to login successfully and new page opem")
	public void the_user_should_able_to_login_successfully_and_new_page_opem() {
		System.out.println("success");
	}
	@Then("the user should able to see the welcome message")
	public void the_user_should_able_to_see_the_welcome_message() {
		lpa.getmsg();
	}
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {	
	}
	@When("the user clicks the Gift Cards")
	public void the_user_clicks_the_gift_cards() {
		hp.clickgift();
	}
	@Then("the user should see the {string} products")
	public void the_user_should_see_the_products(String string) {
		hp.checkgiftassert(string);
	}
	
}
