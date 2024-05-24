package GenericPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeClass
	public void ToLaunch() {
		driver = new ChromeDriver();
		Reporter.log("Browser is launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximised", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@BeforeMethod
	public void ToNavigate() throws IOException {
	  PropertyFile p = new PropertyFile();
	driver.get(p.ToreadDataFromPropertyFile("URL"));
	Reporter.log("Application is launched", true);
}
	
	@AfterMethod
	public void logout() {
		
	}

	@AfterClass
	public void closeTheBrowser() {
		driver.quit();
	}
}
