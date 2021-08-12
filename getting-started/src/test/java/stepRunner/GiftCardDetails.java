package stepRunner;

import net.thucydides.core.annotations.Step;
import pages.AmazonGiftCardDetails;

public class GiftCardDetails {
		
	AmazonGiftCardDetails amazonGiftCardDetails;
	
	@Step
	public void giftValueSelection() {
		amazonGiftCardDetails.selectGiftValue();
	}
	
	@Step
	public void addToCart() {
		amazonGiftCardDetails.addToCart();
	}
	
	@Step
	public void assertCart(int value) {
		amazonGiftCardDetails.assertAddedCart(value);
	}
}
