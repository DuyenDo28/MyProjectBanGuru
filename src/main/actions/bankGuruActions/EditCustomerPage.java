package bankGuruActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import bankGuruUI.NewCustomerUI;
import commonPage.CommonFunctions;

public class EditCustomerPage extends CommonFunctions {

	public EditCustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void inputCustomerID(String CustomerID)
	{
		waitVisible(NewCustomerUI.CUSTOMERID_TXT);
		input(NewCustomerUI.CUSTOMERID_TXT, CustomerID);
	}
	public EditCustomerPage clickSubmitCustomerID()
	{
		waitVisible(NewCustomerUI.SUBMIT_CUSTOMERID_BTN);
		click(NewCustomerUI.SUBMIT_CUSTOMERID_BTN);
		return PageFactory.initElements(driver, EditCustomerPage.class);
			
	}
	public void inputCustomerName(String CustomerName)
	{
		waitVisible(NewCustomerUI.CUSTOMER_NAME_TXT);
		clearText(NewCustomerUI.CUSTOMER_NAME_TXT);
		waitVisible(NewCustomerUI.CUSTOMER_NAME_TXT);
		input(NewCustomerUI.CUSTOMER_NAME_TXT, CustomerName);	
	}
	public HomePage clickSubmitEditCustomer()
	{
		waitVisible(NewCustomerUI.SUBMIT_BTN);
		click(NewCustomerUI.SUBMIT_BTN);
		return PageFactory.initElements(driver, HomePage.class);
		
	}

}
