package testngexecutionTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class foodpandaTest {
	@Test(groups="smoke")
	public void Foodpanda() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foodpanda.com/");
		Reporter.log("foodpanda page", true);
		driver.quit();


}
}
