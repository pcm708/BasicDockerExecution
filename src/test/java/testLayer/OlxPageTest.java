package testLayer;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import static utils.PropertyReader.*;

public class OlxPageTest {

	@Test
	public void getPageTitle() throws MalformedURLException {
		WebDriver driver= null;
		if(getProperty("remote").equals("true")){
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setBrowserName(BrowserType.CHROME);
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities); }
		else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();}
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}