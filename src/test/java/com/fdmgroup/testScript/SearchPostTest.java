package com.fdmgroup.testScript;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.fdmgroup.pages.Homepage;
import com.fdmgroup.pages.Search;
import com.fdmgroup.testData.DataFile;
import com.fdmgroup.util.DriverUtilities;
import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;

public class SearchPostTest {
	
	private DriverUtilities driverUtilities;
	private WebDriver driver;
	
	@Before
	public void init(){
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
		
	}
	
	@Test
	public void searchPostFunctionality() throws InterruptedException{
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Homepage.KijijiLogoLink(driver).click();
		
		Homepage.postSearchField(driver).sendKeys(DataFile.searchKeyword);
		
		new Select(Homepage.postTypeDropdown(driver)).selectByVisibleText(DataFile.postCategory);
		
		Homepage.postLocation(driver).click();
		
		Homepage.postProvince(driver).click();
		
		Homepage.postArea(driver).click();
		
		Homepage.postCity(driver).click();
		
		
		while(!Search.verifyPostIsPresent(driver)){
			Thread.sleep(10000);
			driver.navigate().refresh();
		}
		
		Search.getPost(driver).click();
		
		assertEquals(Search.postIdSpan(driver).getText(), DataFile.postId);
			
	}

}
