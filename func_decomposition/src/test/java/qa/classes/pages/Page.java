package qa.classes.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page {

	protected WebDriver driver;

	/*
	 * Constructor injecting the WebDriver interface
	 * 
	 * @param webDriver
	 */
	public Page(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void waitForPageToLoad()  {
	while(!this.IsPageLoaded()){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}	
	
	protected abstract boolean IsPageLoaded();
	
	public boolean isElementPresent(By locator){
		try{
			driver.findElement(locator);
		}
		catch (Exception e){ return false;}
		return true;
	}
}
