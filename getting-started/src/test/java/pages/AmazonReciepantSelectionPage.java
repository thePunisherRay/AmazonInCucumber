package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AmazonReciepantSelectionPage extends PageObject{
	
	@FindBy (css="div[class='bxc-grid__text a-text-center   bxc-grid__text--light bxc-grid__text--beauty bxc-grid__text--beauty']")
	WebElementFacade giftStoreCheck;
	
	@FindBy(css="a[title='parents']")
	WebElementFacade parent;
	
	public void storeCheck() {
		waitFor(giftStoreCheck);
		$(giftStoreCheck).containsText("The eGift Cards Store");
	}
	
	public void reciepantType() {
		waitFor(parent);
		$(parent).click();
	}
}
