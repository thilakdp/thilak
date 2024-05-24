package Testcase;

import org.testng.annotations.Test;

import GenericPackage.BaseClass;
import POM.WelcomePage;

public class DemoTC_01 extends BaseClass{
	@Test
	public void ClickonRegisterLink() {
		WelcomePage w1= new WelcomePage(driver);
		w1.getRegisterlink();
		
	}
}
