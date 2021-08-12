package stepRunner;

import net.thucydides.core.annotations.Step;
import pages.AmazonProductPage;

public class ProductPage {
	
	AmazonProductPage amazonProductPage;
	
	@Step
	public void changeFilter(String arg) {
		amazonProductPage.ChangeFilter(arg);
	}
	
	@Step
	public void giftCardDetails() {
		amazonProductPage.StoreGiftInfo();
	}
	
	@Step
	public void giftSelection() {
		amazonProductPage.SelectGift();
	}

}
