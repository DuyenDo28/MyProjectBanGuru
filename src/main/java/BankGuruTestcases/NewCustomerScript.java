package BankGuruTestcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ObjectPageJson.jsonData;
import bankGuruActions.HomePage;
import bankGuruActions.LoginPage;
import bankGuruActions.NewCustomerPage;
import bankGuruActions.RegisterPage;
import commonPage.CommonTestcases;

public class NewCustomerScript extends CommonTestcases{
	WebDriver driver;
	RegisterPage registerPage;
	NewCustomerPage newCustomerPage;
	HomePage homePage;
	LoginPage loginPage;
	String userNameLogin, passWordLogin;
	static String customerID;
	RegisterScript registerScript;
	jsonData jsondata;
	String userPath = System.getProperty("user.dir");
	
	@Parameters({"browser","version","url"})
	@BeforeClass
	public void BeforeClass(String browser, String version, String url)
	{
		driver=openMultiBrowser(browser, version, url);
		System.setProperty("webdriver.chrome.driver", userPath.concat("/driver/chromedriver.exe"));
		//registerScript.getAccountRegister();
		userNameLogin=RegisterScript.userName;
		passWordLogin=RegisterScript.passWord;
		//registerPage.NavigateToPage("http://demo.guru99.com/v4/");
		loginPage= PageFactory.initElements(driver, LoginPage.class);
		homePage=loginPage.Login(userNameLogin, passWordLogin);			
	}	
	@BeforeMethod
	public void BeforeMethod()
	{	
		newCustomerPage=homePage.ClickNewCustomer();	
	}
	
	@Test
	public void TC_01_CustomerCannotBlank() {
		jsondata = getDataJson(userPath.concat("\\Data\\BankGuru.json"));
		
		newCustomerPage.inputKeyCustomerName(Keys.TAB);
		//String t = jsondata.NewCustomerPageJson().customerMustNotBeBlank();
		//String t2 = jsondata.ExpectedMsgPage().customerMustNotBeBlank();
		
		verifyEqual(newCustomerPage.getTextDynamicMsg(jsondata.NewCustomerPageJson().customerMustNotBeBlank()),
				jsondata.ExpectedMsgPage().customerMustNotBeBlank());

	}
	@Test
	public void TC_02_DateFieldCannotBlank() {
		newCustomerPage.inputKeyDateOfBirth(Keys.TAB);
		verifyEqual(newCustomerPage.getTextDynamicMsg(jsondata.NewCustomerPageJson().dateMustNotBeBlank()), 
				jsondata.ExpectedMsgPage().dateMustNotBeBlank());
		
	}
	@Test
	public void TC_03_SignUpNewCustomer()
	{
		String email = "DuyenDo" + randomEmail() + "@gmail.com";

		newCustomerPage.inputCustomerName("DuyenDo");
		newCustomerPage.inputDateOfBirth("11/12/1993");

		newCustomerPage.inputAddress("HCM");
		newCustomerPage.inputCity("HCM");
		newCustomerPage.inputState("state");
		newCustomerPage.inputPin("123456");
		newCustomerPage.inputPhoneNumber("1234567890");
		newCustomerPage.inputEmail(email);
		newCustomerPage.inputPassword("1234567890");
		newCustomerPage.clickSubmitBTN();
		customerID = newCustomerPage.getCustomerID();		
	}
	@AfterMethod
//	public void AfterMethod()
//	{	
//		
//	}
	@AfterClass
	public void AfterClass() throws InterruptedException
	{
		//Thread.sleep(5000);
		closeBrowser();
	}

}
