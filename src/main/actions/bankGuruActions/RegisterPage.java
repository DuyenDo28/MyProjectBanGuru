package bankGuruActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import bankGuruUI.RegisterPageUI;
import commonPage.CommonFunctions;

public class RegisterPage extends CommonFunctions{
	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void inputEmail(String email)
	{
		waitVisible(RegisterPageUI.EMAIL_REGISTER_TXT);
		input(RegisterPageUI.EMAIL_REGISTER_TXT, email);
	}
	public RegisterPage clickSubmit()
	{
		waitVisible(RegisterPageUI.SUBMIT_BTN);
		click(RegisterPageUI.SUBMIT_BTN);
		return PageFactory.initElements(driver, RegisterPage.class);
	}
	public String getUserName()
	{
		waitVisible(RegisterPageUI.USERNAME_LBL);
		return getText(RegisterPageUI.USERNAME_LBL);
		
	}
	public String getPassword()
	{
		waitVisible(RegisterPageUI.PASSWORD_LBL);
		return getText(RegisterPageUI.PASSWORD_LBL);
		
	}
	public void NavigateToPage(String url)
	{
		navigate(url);
	}
	

}
