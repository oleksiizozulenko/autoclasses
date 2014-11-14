package qa.classes.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SerenaHomePage extends Page {

	public SerenaHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void open() {
		driver.get("http://www.serena.com/");
		this.waitForPageToLoad();
	}

	public ProductsPage GoToProductPage() {
		 WebElement productsmenuLink=driver.findElement(By.xpath("//li[@id='products-menu']/a"));
		
		 productsmenuLink.click();
		 ProductsPage pr =  new ProductsPage(driver);
		pr.waitForPageToLoad();
		return pr;
	}

	@Override
	protected boolean IsPageLoaded() {
		return isElementPresent(By.id("banner-slides"));
	}

	

	
}
