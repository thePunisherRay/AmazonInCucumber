package stepRunner;

import net.thucydides.core.annotations.Step;
import pages.AmazonReciepantSelectionPage;

public class ReciepientSelectionPage {

	AmazonReciepantSelectionPage amazonReciepantSelectionPage;
	
	@Step
	public void giftCardStorePageCheck() {
		amazonReciepantSelectionPage.storeCheck();
	}
	
	@Step
	public void reciepantType() {
		amazonReciepantSelectionPage.reciepantType();
	}
	
	
}
