package BankGuruTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bankGuruActions.EditCustomerPage;
import bankGuruActions.HomePage;
import bankGuruActions.LoginPage;
import commonPage.CommonTestcases;

public class EditCustomerScript extends CommonTestcases {
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	RegisterScript registerScript;
	NewCustomerScript newCustomerScript;
	EditCustomerPage editCustomerPage;
	String CustomerID, userNameLogin,passWordLogin;
	@Parameters({"browser","version","url"})
	@BeforeClass
    public void BeforeClass(String browser, String version, String url)
    {
		driver=openMultiBrowser(browser, version, url);
		CustomerID= NewCustomerScript.customerID;
		userNameLogin=RegisterScript.userName;
		passWordLogin=RegisterScript.passWord;
		loginPage= PageFactory.initElements(driver, LoginPage.class);
		homePage=loginPage.Login(userNameLogin, passWordLogin);
		editCustomerPage=homePage.ClickEditCustomer();
		editCustomerPage.inputCustomerID(CustomerID);
		editCustomerPage.clickSubmitCustomerID();
							
    }
	@Test
	public void TC_01_EditCustomerName()
	{
		
	//	editCustomerPage.inputCustomerName("Kimle");
	//	editCustomerPage.clickSubmitEditCustomer();
		
	}
	@AfterClass
	public void AfterClass()
	{
		//closeBrowser();
	}
	

}
