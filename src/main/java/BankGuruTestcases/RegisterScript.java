package BankGuruTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bankGuruActions.LoginPage;
import bankGuruActions.RegisterPage;
import commonPage.CommonTestcases;

public class RegisterScript extends CommonTestcases {
	WebDriver driver;
	LoginPage loginPage;
	RegisterPage registerPage;
	public static String userName;
	public static String passWord;

	@Parameters({ "browser", "version", "url" })
	@BeforeClass
	public void beforeClass(String browser, String version, String url) {
		driver = openMultiBrowser(browser, version, url);
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	    registerPage=loginPage.ClickHereLink();

	}

	@Test
	public void getAccountRegister() {
		String email= "kieuduyen" +randomEmail()+"@gmail.com";
		registerPage.inputEmail(email);
		registerPage.clickSubmit();
		userName=registerPage.getUserName();
		passWord=registerPage.getPassword();
	//	registerPage.NavigateToPage("http://demo.guru99.com/v4/");
	//	loginPage.Login(userName, passWord);
//		loginPage.inputUserName(userName);
//		loginPage.inputPassword(passWord);
//		loginPage.ClickLogin();
		
		
		

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();

	}

}
