package com.actions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.pages.Addtocardpage;
import com.utilities.Helpclass;

import io.cucumber.datatable.DataTable;

public class Addtocardaction {
	Addtocardpage ad;

    public Addtocardaction() {
        ad = new Addtocardpage();
    }
	public void selsortop(DataTable dataTable) {
        String expected = "Price: Low to High";
        List<String> options=dataTable.asList();
        for (String option:options) {
            if (option.equals(expected)) {
                Select se=new Select(ad.sortby);
                se.selectByVisibleText(expected);
                break;
            }
        }
    }
	public void seldisplay(DataTable dataTable) {
		 String expected = "8";
		 List<String> options=dataTable.asList();
		 for(String option:options) {
			 if(option.equals(expected)){
				 Select se=new Select(ad.display);
	                se.selectByVisibleText(expected);
	                break;
			 }
		 }
	}
	public void selview(DataTable dataTable) {
		 String expected = "Grid";
		 List<String> options=dataTable.asList();
		 for(String option:options) {
			 if(option.equals(expected)){
				 Select se=new Select(ad.view);
	                se.selectByVisibleText(expected);
	                break;
			 }
		 }
	}
}
