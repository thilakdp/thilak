package testngexecutionTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class swiggyTest {
	@Test(groups="system")
	public void Swiggy() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Reporter.log("swiggy page", true);
		driver.quit();

}
}
