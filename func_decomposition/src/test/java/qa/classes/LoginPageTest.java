package qa.classes;

import static org.junit.Assert.*;

import org.junit.Test;

import qa.classes.pages.LoginPage;
import qa.classes.pages.LoginSuccessPage;

public class LoginPageTest  extends BaseTest {
	
	//All setup & initing driver located in BaseTest class
	
	
	@Test
	public void testSubmitForm() {
		
		//init page object of login page
		LoginPage loginPage = new LoginPage(driver);
		
		//GIVEN: login page opened
		loginPage.open();
		
		//When I submit form
		LoginSuccessPage success = loginPage.submitForm("tomsmith",
				"SuperSecretPassword!");
		
		//Then i should see page with title
		assertEquals("Secure Area", success.getTitle());
	}
	
	@Test
	public void testWithLowLevelOperations() {
		
		//init page object of login page
		LoginPage loginPage = new LoginPage(driver);
		loginPage.open();
		
		//GIVEN: login page opened
		loginPage.open();
		
		//When I fill username
		loginPage.setUserName("tomsmith");
		//and fill password
		loginPage.setPassword("SuperSecretPassword!");
		//and click login
		loginPage.clickLogin();
		
		
		//init next page to check if it is loaded
		LoginSuccessPage success = new LoginSuccessPage(driver);
		
		//Then i should see page with title
		assertEquals("Secure Area", success.getTitle());
	}

}
