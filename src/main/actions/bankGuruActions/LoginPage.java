package bankGuruActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import BankGuruTestcases.RegisterScript;
import bankGuruUI.LoginPageUI;

import commonPage.CommonFunctions;

public class LoginPage extends CommonFunctions  {
	RegisterPage registerPage;
	RegisterScript registerScript;
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public RegisterPage ClickHereLink() {
		waitVisible(LoginPageUI.HERE_LINK);
		click(LoginPageUI.HERE_LINK);
		return PageFactory.initElements(driver, RegisterPage.class);

	}
	public void inputUserName(String username)
	{
		waitVisible(LoginPageUI.USERNAME_LOGIN_TXT);
		input(LoginPageUI.USERNAME_LOGIN_TXT, username);
		
		
	}
	public HomePage ClickLogin()
	{
		click(LoginPageUI.LOGIN_BTN);
		return PageFactory.initElements(driver, HomePage.class);
	
	}
	public void inputPassword(String password)
	{
		waitVisible(LoginPageUI.PASSWORD_LOGIN_TXT);
		input(LoginPageUI.PASSWORD_LOGIN_TXT, password);
		
		
	}
	public HomePage Login(String username,String password)
	{
		waitVisible(LoginPageUI.USERNAME_LOGIN_TXT);
		input(LoginPageUI.USERNAME_LOGIN_TXT, username);
		waitVisible(LoginPageUI.PASSWORD_LOGIN_TXT);
		input(LoginPageUI.PASSWORD_LOGIN_TXT, password);
		click(LoginPageUI.LOGIN_BTN);
		return PageFactory.initElements(driver,HomePage.class);
		
	}

}
