package qa.classes.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page that represents area after login 
 */
public class LoginSuccessPage extends Page {

	public LoginSuccessPage(WebDriver driver) {
		super(driver);
	}

	public String getTitle() {
		return driver.findElement(By.xpath("//h2")).getText();
	}

	@Override
	protected boolean IsPageLoaded() {
		// TODO Auto-generated method stub
		return false;
	}
}
