package qa.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TDDExmpl extends BaseTest {

	FirefoxDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
	}

	//@After
	//@Ignore
	public void tearDown() {
		if (driver != null) {
			driver.close();
			driver = null;
		}
	}

	@Test
	public void testTDDFirst() {
		openGooglePage();
		typeQuery("hello");
		linkContains("hello");
	}

	@Test
	public void testDropDown(){
		driver.get("http://the-internet.herokuapp.com/dropdown");
		WebElement sel = driver.findElement(By.id("dropdown"));
		Select selEl = new Select(sel);
		selEl.selectByVisibleText("Option 1");
	}
	
	
	
	private void linkContains(String string) {
		// TODO Auto-generated method stub

	}

	private void typeQuery(String string) {
		// type to query input
		WebElement q = driver.findElement(By.id("gbqfq"));
		q.sendKeys(string);
		q.sendKeys(Keys.ENTER);
	}

	private void openGooglePage() {
		driver.get("http://google.com");
	}

}
