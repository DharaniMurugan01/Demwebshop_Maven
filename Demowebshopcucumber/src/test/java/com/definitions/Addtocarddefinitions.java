package com.definitions;

import org.openqa.selenium.WebDriver;
import com.actions.Addtocardaction;
import com.utilities.Helpclass;
import com.utilities.Helpclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addtocarddefinitions {
	Addtocardaction ad=new Addtocardaction();
	@Given("I am on the product page")
	public void i_am_on_the_product_page() {
		Helpclass.driver.get("https://demowebshop.tricentis.com/gift-cards");
	}

	@When("I select a sorting option from the dropdown")
	public void i_select_a_sorting_option_from_the_dropdown(io.cucumber.datatable.DataTable dataTable) {
	   ad.selsortop(dataTable);
	}

	@When("I select a display count from the dropdown")
	public void i_select_a_display_count_from_the_dropdown(io.cucumber.datatable.DataTable dataTable) {
		ad.seldisplay(dataTable);
	}

	@When("I select a view type from the dropdown")
	public void i_select_a_view_type_from_the_dropdown(io.cucumber.datatable.DataTable dataTable) {
		ad.selview(dataTable);
	}

	@Then("the products should show the product correctly")
	public void the_products_should_show_the_product_correctly() {
	}
}
