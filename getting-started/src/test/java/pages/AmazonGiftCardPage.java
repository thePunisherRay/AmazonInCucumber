package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AmazonGiftCardPage extends PageObject {
	
	@FindBy(className ="nav-a nav-b")
	WebElementFacade giftCardLinkLeftNav;
	
	@FindBy(css = "img[alt='Email gift cards']")
	WebElementFacade eGiftCard;
	
	public void searchVerification() {
		System.out.println(giftCardLinkLeftNav);
	}
	
	public void giftCardType() {
		waitFor(eGiftCard);
		$(eGiftCard).click();
	}

}
