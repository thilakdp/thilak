package testngexecutionTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class blinkitTest {
	@Test(groups="smoke")
	public void linkit() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://blinkit.com/");
		Reporter.log("blinkit page", true);
		driver.quit();

}
}