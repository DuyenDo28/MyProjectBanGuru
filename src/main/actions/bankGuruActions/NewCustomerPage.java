package bankGuruActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import bankGuruUI.NewCustomerUI;
import commonPage.CommonFunctions;

public class NewCustomerPage extends CommonFunctions {

	public NewCustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void inputKeyCustomerName(Keys value) {
		waitVisible(NewCustomerUI.CUSTOMER_NAME_TXT);
		inputKeys(NewCustomerUI.CUSTOMER_NAME_TXT, value);

	}

	public void inputKeyCity(Keys value) {
		waitVisible(NewCustomerUI.CITY_TXT);
		inputKeys(NewCustomerUI.CITY_TXT, value);

	}

	public void inputKeyDateOfBirth(Keys value) {
		waitVisible(NewCustomerUI.DATEOFBILRTH);
		inputKeys(NewCustomerUI.DATEOFBILRTH, value);

	}

	public String getTextCustomerLBL() {
		waitVisible(NewCustomerUI.CUSTOMER_NAME_LBL);
		return getText(NewCustomerUI.CUSTOMER_NAME_LBL);

	}

	public String getTextDynamicMsg(String value) {
		waitVisibleDynamicElement(NewCustomerUI.DYNAMIC_MSG, value);
		return getTextDynamicElement(NewCustomerUI.DYNAMIC_MSG, value);

	}

	public String getTextCityLBL() {
		waitVisible(NewCustomerUI.CITY_LBL);
		return getText(NewCustomerUI.CITY_LBL);

	}

	public String getTextDateOfBirthLBL() {
		waitVisible(NewCustomerUI.DATEOFBIRTH_LBL);
		return getText(NewCustomerUI.DATEOFBIRTH_LBL);

	}

	public void inputNumbericToCustomer() {
		waitVisible(NewCustomerUI.CUSTOMER_NAME_TXT);
		input(NewCustomerUI.CUSTOMER_NAME_TXT, "123");
	}

	public void inputSpecialToCustomer() {
		waitVisible(NewCustomerUI.CUSTOMER_NAME_TXT);
		input(NewCustomerUI.CUSTOMER_NAME_TXT, "@");
	}

	public void inputFirstSpaceToCustomer() {
		waitVisible(NewCustomerUI.CUSTOMER_NAME_TXT);
		input(NewCustomerUI.CUSTOMER_NAME_TXT, " abc123");
	}

	public void inputNumbericToCity() {
		waitVisible(NewCustomerUI.CITY_TXT);
		input(NewCustomerUI.CITY_TXT, "1234 city123");

	}

	public void inputSpecialToCity() {
		waitVisible(NewCustomerUI.CITY_TXT);
		input(NewCustomerUI.CITY_TXT, "City!@# !@#");
	}

	public void inputFirstSpaceToCity() {
		waitVisible(NewCustomerUI.CITY_TXT);
		input(NewCustomerUI.CITY_TXT, " abc123");
	}

	public void inputKeyToState(Keys key) {
		waitVisible(NewCustomerUI.STATE_TXT);
		inputKeys(NewCustomerUI.STATE_TXT, key);
	}

	public String getTextStateLBL() {
		waitVisible(NewCustomerUI.STATE_LBL);
		return getText(NewCustomerUI.STATE_LBL);
	}

	public void inputNumericToState() {
		waitVisible(NewCustomerUI.STATE_TXT);
		input(NewCustomerUI.STATE_TXT, "1234 State123");
	}

	public void inputFirstSpaceToState() {
		waitVisible(NewCustomerUI.STATE_TXT);
		input(NewCustomerUI.STATE_TXT, " State");
	}

	public void inputSpecialToState() {
		waitVisible(NewCustomerUI.STATE_TXT);
		input(NewCustomerUI.STATE_TXT, "@!#");
	}

	public void inputStringToPin() {
		waitVisible(NewCustomerUI.PIN_TXT);
		input(NewCustomerUI.PIN_TXT, "ABC");
	}

	public String getTextPinLBL() {
		waitVisible(NewCustomerUI.PIN_LBL);
		return getText(NewCustomerUI.PIN_LBL);
	}

	public void inputEmptyToPin(Keys key) {
		waitVisible(NewCustomerUI.PIN_TXT);
		inputKeys(NewCustomerUI.PIN_TXT, key);
	}

	public void inputLessThan6ToPin() {
		waitVisible(NewCustomerUI.PIN_TXT);
		input(NewCustomerUI.PIN_TXT, "12345");
	}

	public void inputSpecialToPin() {
		waitVisible(NewCustomerUI.PIN_TXT);
		input(NewCustomerUI.PIN_TXT, "@!#");
	}

	public void inputFirstSpaceToPin() {
		waitVisible(NewCustomerUI.PIN_TXT);
		input(NewCustomerUI.PIN_TXT, " 12345");
	}

	public void inputEmptyToMobilePhone() {
		waitVisible(NewCustomerUI.MOBILE_TXT);
		inputKeys(NewCustomerUI.MOBILE_TXT, Keys.TAB);
	}

	public String getTextMobileLBL() {
		waitVisible(NewCustomerUI.MOBILE_LBL);
		return getText(NewCustomerUI.MOBILE_LBL);

	}

	public void inputFirstSpaceToMobile() {
		waitVisible(NewCustomerUI.MOBILE_TXT);
		input(NewCustomerUI.MOBILE_TXT, " 1234512345");
	}

	public void inputSpaceToMobile() {
		waitVisible(NewCustomerUI.MOBILE_TXT);
		input(NewCustomerUI.MOBILE_TXT, "123451 2345");
	}

	public void inputSpecialToMobile() {
		waitVisible(NewCustomerUI.MOBILE_TXT);
		input(NewCustomerUI.MOBILE_TXT, "@!#");
	}

	public void inputEmptyToEmail() {
		waitVisible(NewCustomerUI.EMAIL_TXT);
		inputKeys(NewCustomerUI.EMAIL_TXT, Keys.TAB);
	}

	public String getTextEmailLBL() {
		waitVisible(NewCustomerUI.EMAIL_LBL);
		return getText(NewCustomerUI.EMAIL_LBL);
	}

	public void inputIncorrectFormatToEmail() {
		waitVisible(NewCustomerUI.EMAIL_TXT);
		input(NewCustomerUI.EMAIL_TXT, "guru99");
	}

	public void inputSpaceToEmail() {
		waitVisible(NewCustomerUI.EMAIL_TXT);
		input(NewCustomerUI.EMAIL_TXT, "we @gmail");
	}

	public String getTextAfterClickOnSubmit() {
		waitVisible(NewCustomerUI.SUBMIT_BTN);
		click(NewCustomerUI.SUBMIT_BTN);
		return getTextAlert1();
	}

	public void inputCustomerName(String customer) {
		waitVisible(NewCustomerUI.CUSTOMER_NAME_TXT);
		input(NewCustomerUI.CUSTOMER_NAME_TXT, customer);
	}

	public void inputDateOfBirth(String DOB) {
		waitVisible(NewCustomerUI.DATEOFBILRTH);
		input(NewCustomerUI.DATEOFBILRTH, DOB);
	}

	public void inputAddress(String address) {
		waitVisible(NewCustomerUI.ADDRESS_AREA);
		input(NewCustomerUI.ADDRESS_AREA, address);
	}

	public void inputCity(String city) {
		waitVisible(NewCustomerUI.CITY_TXT);
		input(NewCustomerUI.CITY_TXT, city);
	}

	public void inputState(String state) {
		waitVisible(NewCustomerUI.STATE_TXT);
		input(NewCustomerUI.STATE_TXT, state);
	}

	public void inputPin(String pin) {
		waitVisible(NewCustomerUI.PIN_TXT);
		input(NewCustomerUI.PIN_TXT, pin);
	}

	public void inputPhoneNumber(String phoneNumber) {
		waitVisible(NewCustomerUI.MOBILE_TXT);
		input(NewCustomerUI.MOBILE_TXT, phoneNumber);
	}

	public void inputEmail(String email) {
		waitVisible(NewCustomerUI.EMAIL_TXT);
		input(NewCustomerUI.EMAIL_TXT, email);
	}

	public void inputPassword(String password) {
		waitVisible(NewCustomerUI.PASSWORD_TXT);
		input(NewCustomerUI.PASSWORD_TXT, password);
	}

	public void clickSubmitBTN() {
		waitVisible(NewCustomerUI.SUBMIT_BTN);
		click(NewCustomerUI.SUBMIT_BTN);
	}

	public String getCustomerID() {
		waitVisible(NewCustomerUI.CUSTOMERID);
		return getText(NewCustomerUI.CUSTOMERID);
	}

	

}
