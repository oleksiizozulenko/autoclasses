package qa.classes.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Page that represent Login page 
 */
public class LoginPage extends Page {

	public LoginPage(WebDriver drv) {
		//just give control to parent class
		super(drv);
	}

	public void open() {
		driver.get("http://the-internet.herokuapp.com/login");
	}

	public LoginSuccessPage submitForm(String user, String pass) {
		setUserName(user);
		setPassword(pass);
		clickLogin();
		return new LoginSuccessPage(driver);
	}

	public void clickLogin() {
		driver.findElement(By.className("radius")).click();
	}

	public void setPassword(String pass) {
		WebElement username = driver.findElement(By.id("password"));
		username.sendKeys(pass);
	}

	public void setUserName(String user) {
		driver.findElement(By.id("username")).sendKeys(user);
	}

	@Override
	protected boolean IsPageLoaded() {
		// TODO Auto-generated method stub
		return false;
	}

}
