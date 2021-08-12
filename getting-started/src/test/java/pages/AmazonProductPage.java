package pages;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AmazonProductPage extends PageObject {
	
	@FindBy(css="select[id='s-result-sort-select']")
	WebElementFacade filter;
	
	@FindBy(css="a[class='a-link-normal a-text-normal']")
	WebElementFacade productLocator;
	
	@FindBy(css="a[class='a-size-base a-link-normal a-text-normal']")
	WebElementFacade priceLocator;
	
	@FindBy(css="a[class='a-link-normal s-no-outline']")
	WebElementFacade parentURL;
	
	//private By ratingLocator=new ByChained(By.cssSelector("div[class='a-section a-spacing-none a-spacing-top-micro']"),By.cssSelector("span[class='a-declarative']"));
	
	public void ChangeFilter(String arg) {
		Select dropDown = new Select(filter);
		dropDown.selectByIndex(1);;
		Reporter.log("Filter clicked"+arg,true);
	}
	
	public void StoreGiftInfo() {
		String productName= $(productLocator).getText();
		//WebElement rating=$(ratingLocator);
		String price= $(priceLocator).getText();
		HashMap<String, String> giftMap=new HashMap<String,String>();
		giftMap.put("Product Name", productName);
		giftMap.put("Price", price);
		System.out.println(giftMap);
	}
	
	public void SelectGift() {
		WebElement rating=$(parentURL);
		String url = rating.getAttribute("href");
		openUrl(url);
	}
}
