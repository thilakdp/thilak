package testngexecutionTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class kfcTest {
@Test(groups = "smoke")
public void Kfc() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://online.kfc.co.in/");
	Reporter.log("kfc page", true);
	driver.quit();
	
}

}
