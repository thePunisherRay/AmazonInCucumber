package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



public class AmazonHomePage extends PageObject{
	
	@FindBy(id="searchDropdownBox")
	private WebElementFacade searchDropDown;
	
	private By searchButton= By.id("nav-search-submit-button");
	
	public void selectProduct(String arg) {
		Select dropDown = new Select(searchDropDown);
		dropDown.selectByVisibleText(arg);
		Reporter.log("product selected"+arg,true);
	}
	
	public void ClickSearcbutton() {
		$(searchButton).click();
	}
}
