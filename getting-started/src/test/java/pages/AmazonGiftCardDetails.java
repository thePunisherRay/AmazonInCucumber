package pages;

import org.testng.Assert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AmazonGiftCardDetails extends PageObject{

	@FindBy(id="gc-mini-picker-amount-1")
	WebElementFacade giftValue;
	
	@FindBy(css="input[id='gc-buy-box-atc']")
	WebElementFacade addToCartButton;
	
	@FindBy(css="span[class='a-color-price hlb-price a-inline-block a-text-bold']")
	WebElementFacade cartText;
	
	public void selectGiftValue() {
		$(giftValue).click();
	}
	
	public void addToCart() {
		$(addToCartButton).click();
	}
	
	public void assertAddedCart(int cartValue) {
		Assert.assertEquals($(cartText).getText().contains(Integer.toString(cartValue)),true);
	}
}
