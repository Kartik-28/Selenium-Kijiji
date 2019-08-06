package com.fdmgroup.testScript;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.pages.Homepage;
import com.fdmgroup.pages.MyAds;
import com.fdmgroup.testData.DataFile;
import com.fdmgroup.util.DriverUtilities;

public class DeletePostTest {
	
	private DriverUtilities driverUtilities;
	private WebDriver driver;
	
	@Before
	public void init(){
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();	
	}
	
	@Test
	public void addDeletionFunctionality() throws InterruptedException{
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		Homepage.KijijiLogoLink(driver).click();
		
		Thread.sleep(3000);
		
		try{
		Homepage.popUpLaterBtn(driver).click();
		}
		catch(NoSuchElementException e){
			
			System.out.println("No Pop up present under profile icon");
		}
		
		Thread.sleep(2000);
	
		Homepage.profileIcon(driver).click();
		
		MyAds.myAddPageLi(driver).click();
		
		Thread.sleep(3000);
		
		MyAds.findAdsInputfield(driver).sendKeys(DataFile.postTitle);
		
		Thread.sleep(1000);
		
		MyAds.findAdsInputfield(driver).sendKeys(Keys.ENTER);
		
		MyAds.myAddDeleteBtn(driver).click();
		
		Thread.sleep(3000);
		
		assertEquals(MyAds.deletionSuccessMesage(driver).getText(),DataFile.deletionConformationMessage);
		
		MyAds.deletionReasonListElement(driver).click();
		
		MyAds.logoutOutBtn(driver).click();
		
		driver.quit();
		
	}

}
