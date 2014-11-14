package qa.classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import ru.stqa.selenium.factory.WebDriverFactory;

public class BaseTest {

	protected static WebDriver driver;

	@BeforeClass
	public static void setUpAll() throws Exception {
	
		driver = WebDriverFactory.getDriver(DesiredCapabilities.firefox());
	}

	@AfterClass
	public static void tearDownAll() throws Exception {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
	
	@Before
	public void setUp() {}
	
	@After
	public void tearDown() {}
}
