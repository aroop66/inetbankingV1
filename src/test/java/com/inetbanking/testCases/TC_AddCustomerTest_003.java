package com.inetbanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass{
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		
		
		logger.info("Providing customer details...");
		
		addcust.custName("Arup");
		addcust.custGender("male");
		addcust.custDOB("12", "13", "1991");
		Thread.sleep(3000);
		addcust.custAddress("INDIA");
		addcust.custCity("HYD");
		addcust.custState("TEL");
		addcust.custPinno("500058");
		addcust.custTelephoneno("7842099934");
		
		String email = randomString()+"@gmail.com"; //Randomly generate strings
		addcust.custEmailid(email);
		
		addcust.custPassword("abcdef");
		addcust.submitButton();
		
		Thread.sleep(3000);
		
		logger.info("Validation started...");
		
		
		//To validate the customer is added succesfully through the message.
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");	
		
		if(res == true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed...");
		}
		else
		{

			logger.info("test case failed...");
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
		
		}
		
			
	}


}
