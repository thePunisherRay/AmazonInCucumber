package stepDefinition;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import stepRunner.GiftCardDetails;
import stepRunner.GiftTypePage;
import stepRunner.HomePage;
import stepRunner.ProductPage;
import stepRunner.ReciepientSelectionPage;

public class GiftCardSearch {

	@Steps
	HomePage home;
	@Steps
	GiftTypePage giftType;
	@Steps
	ReciepientSelectionPage reciepantSelection;
	@Steps
	ProductPage product;
	@Steps
	GiftCardDetails giftCardDetails;
	

	@io.cucumber.java.en.Given("^User is on Amazon web page$")
	public void user_is_on_amazon_home_page() {
		home.openApplication();
	}

	@When("User selects Gift Cards from search drop down")
	public void User_selects_Gift_Cards_from_search_drop_down() {
		home.SearchProduct("Gift Cards");
	}

	@And("Clicks search button")
	public void Clicks_search_button() {
		home.ClickSearcbutton();
	}

	@Then("Navigation contains Gift Cards")
	public void Navigation_contains_Gift_Cards() {
		giftType.URLCheck();
	}

	@When("^User clicks on eGift card Type$")
	public void user_clicks_on_eGift_card_Type() {
		giftType.giftCardType();
	}

	/*
	 * @Then("^Gift card store is displayed on Webpage$") public void
	 * gift_card_store_is_displayed_on_Webpage() {
	 * reciepantSelection.giftCardStorePageCheck(); }
	 */

	@When("^User Selects Parents as reciepient$")
	public void user_Selects_Parents_as_reciepient() {
	    reciepantSelection.reciepantType();
	}

	/*
	 * @Then("^Monthers day should appear under occasion$") public void
	 * monthers_day_should_appear_under_occasion() {
	 * 
	 * }
	 */


	@And("^Selects Price \"([^\"]*)\"$")
	public void selects_Price(String arg) {
	    product.changeFilter(arg);
	}


	@Then("^User selects the first product$")
	public void user_selects_the_first_product() {
		product.giftCardDetails();
		product.giftSelection();
	}


	@When("^User clicks on (\\d+)$")
	public void user_clicks_on(int arg1) {
	    giftCardDetails.giftValueSelection();
	}

	@When("^Clicks on Add to cart$")
	public void clicks_on_Add_to_cart() {
	    giftCardDetails.addToCart();
	}

	@Then("^Amount added should be displayed$")
	public void amount_added_should_be_displayed() {
	    giftCardDetails.assertCart(500);
	}

}
