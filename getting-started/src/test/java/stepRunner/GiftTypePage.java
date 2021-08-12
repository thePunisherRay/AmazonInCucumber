package stepRunner;

import net.thucydides.core.annotations.Step;
import pages.AmazonGiftCardPage;

public class GiftTypePage {

	AmazonGiftCardPage amazonGiftCardPage;

	@Step
	public void URLCheck() {
		amazonGiftCardPage.searchVerification();
	}

	@Step
	public void giftCardType() {
		amazonGiftCardPage.giftCardType();
	}

}
