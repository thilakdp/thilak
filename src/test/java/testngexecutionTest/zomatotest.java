package testngexecutionTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class zomatotest {
	@Test(groups="system")
	public void Zomato() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/bangalore");
		Reporter.log("zomato page", true);
		driver.quit();
}
}
