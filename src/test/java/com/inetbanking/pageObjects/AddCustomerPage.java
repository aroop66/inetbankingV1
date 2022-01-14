package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Elements
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='New Customer']")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(how =  How.NAME, using = "name")
	@CacheLookup 
	WebElement txtCustomerName;
	
	@FindBy(how = How.NAME, using = "rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how = How.ID_OR_NAME  , using = "dob")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how = How.NAME  , using = "addr")
	@CacheLookup
	WebElement txtAddress;
	
	@FindBy(how = How.NAME , using = "city")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(how = How.NAME  , using = "state")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(how = How.NAME  , using = "pinno")
	@CacheLookup
	WebElement txtPinno;
	
	@FindBy(how = How.NAME  , using = "telephoneno")
	@CacheLookup
	WebElement txtTelephoneno;
	
	@FindBy(how = How.NAME  , using = "emailid")
	@CacheLookup
	WebElement txtEmailid;
	
	@FindBy(how = How.NAME  , using = "password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(how = How.NAME  , using = "sub")
	@CacheLookup
	WebElement btnSubmit;
	
	
	
	//Action methods
	
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
	}
	
	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
	}
	
	public void custGender(String cgender) {
		rdGender.click();
	}
	
	public void custDOB(String mm, String dd, String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void custAddress(String caddress) {
		txtAddress.sendKeys(caddress);
	}
	
	public void custCity(String ccity) {
		txtCity.sendKeys(ccity);
	}
	
	public void custState(String cstate) {
		txtState.sendKeys(cstate);
	}
	
	public void custPinno(String cpinno ) {
		txtPinno.sendKeys(cpinno);
	}

	public void custTelephoneno(String ctelephoneno) {
		txtTelephoneno.sendKeys(ctelephoneno);
	}
	
	public void custEmailid(String cemailid) {
		txtEmailid.sendKeys(cemailid);
	}
	
	public void custPassword(String cpassword) {
		txtPassword.sendKeys(cpassword);
	}
	
	public void submitButton() {
		btnSubmit.click();
	}
}
