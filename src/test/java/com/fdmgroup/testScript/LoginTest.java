package com.fdmgroup.testScript;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.pages.Homepage;
import com.fdmgroup.pages.SignIn;
import com.fdmgroup.testData.DataFile;
import com.fdmgroup.util.DriverUtilities;
import com.google.common.base.Verify;

public class LoginTest {
	
	private DriverUtilities driverUtilities;
	private WebDriver driver;
	
	@Before
	public void init(){
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
	}
	
	@Test
	public void testLoginFunctionality() throws InterruptedException{
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.kijiji.ca/");
		driver.manage().window().maximize();
		Homepage.signInLink(driver).click();
		
		SignIn.emailOrNicknameField(driver).sendKeys(DataFile.userEmail);
		SignIn.passwordField(driver).sendKeys(DataFile.userPassword);
		
		SignIn.signInButton(driver).click();
		
		//Thread.sleep(1000);
	
		Verify.verify(Homepage.profileIcon(driver).isDisplayed());
	}

}
