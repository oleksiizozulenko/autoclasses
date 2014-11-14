package qa.classes;

import static org.junit.Assert.*;

import org.junit.Test;

import qa.classes.pages.ProductsPage;
import qa.classes.pages.SerenaHomePage;

public class SerenaSiteTest extends BaseTest  {
	
	@Test
	public void testProductsPage(){
		//Given
		SerenaHomePage homePage = new SerenaHomePage(driver);
		homePage.open();
		
		//When
		ProductsPage products = homePage.GoToProductPage();
		
		//then
		assertTrue(products.IsProductPresent("Serena Deployment Automation"));
		assertTrue(products.IsProductPresent("Serena Release Manager"));
	}

}
