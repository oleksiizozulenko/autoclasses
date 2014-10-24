package qa.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDDExmpl {
	
	
	FirefoxDriver driver;
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
	}
	
	@After
	public void tearDown(){
		if (driver != null){
			driver.close();
			driver = null;
		}
	}
	
	
	@Test
	public void testTDDFirst(){
		openGooglePage();
		typeQuery("hello");
		linkContains("hello");		
	}

	private void linkContains(String string) {
		// TODO Auto-generated method stub
		
	}

	private void typeQuery(String string) {
		//type to query input
		WebElement q = driver.findElement(By.id("gbqfq"));
		q.sendKeys(string);
		q.sendKeys(Keys.ENTER);
	}

	private void openGooglePage() {
		driver.get("http://google.com");
	}
	
	
	

}
