package stepRunner;

import net.thucydides.core.annotations.Step;
import pages.AmazonHomePage;

public class HomePage {

	AmazonHomePage amazonHomePage;

	@Step
	public void openApplication() {
		amazonHomePage.open();
	}

	@Step
	public void SearchProduct(String arg) {
		amazonHomePage.selectProduct(arg);
	}

	@Step
	public void ClickSearcbutton() {
		amazonHomePage.ClickSearcbutton();
	}
}
