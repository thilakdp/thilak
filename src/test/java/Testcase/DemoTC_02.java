package Testcase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericPackage.BaseClass;
import GenericPackage.ExcelFile;
import POM.Loginpage;
import POM.WelcomePage;

public class DemoTC_02 extends BaseClass {
	@Test
	public void ToLogin() throws EncryptedDocumentException, IOException {
	WelcomePage p = new WelcomePage(driver);
	p.getLoginlink().click();
	Loginpage l = new Loginpage(driver);
	ExcelFile e = new ExcelFile();
	l.getEmailtextField().sendKeys(e.ToReadDatafromExcel("Login", 1, 2));
	l.getpasswordTextfield().sendKeys(e.ToReadDatafromExcel("Login", 1, 3));
	l.getLoginButton().click();
	
}

}
