package bankGuruActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import bankGuruUI.HomePageUI;
import commonPage.CommonFunctions;

public class HomePage extends CommonFunctions {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public NewCustomerPage ClickNewCustomer()
	{
		waitVisible(HomePageUI.NEWCUSTOMER_MENU);
		click(HomePageUI.NEWCUSTOMER_MENU);
		
		return PageFactory.initElements(driver, NewCustomerPage.class);
		
	}
	public EditCustomerPage ClickEditCustomer()
	{
		waitVisible(HomePageUI.EDITCUSTOMER_LINK);
		click(HomePageUI.EDITCUSTOMER_LINK);
		return PageFactory.initElements(driver, EditCustomerPage.class);
		
	}
	

}
