package qa.classes.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends Page {

	public ProductsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean IsProductPresent(String productName) {
	
		return this.isElementPresent(By.xpath("//div[contains(@class,'row') and //descendant::h2[contains(text(), '"+productName+"')]]"));
	}

	@Override
	protected boolean IsPageLoaded() {
		// TODO Auto-generated method stub
		return true;
	}

	

}
