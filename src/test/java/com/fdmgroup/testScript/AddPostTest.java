package com.fdmgroup.testScript;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.fdmgroup.pages.AddPost;

import com.fdmgroup.pages.Homepage;
import com.fdmgroup.testData.DataFile;
import com.fdmgroup.util.DriverUtilities;
import static org.junit.Assert.*;

public class AddPostTest {

	private DriverUtilities driverUtilities;
	private WebDriver driver;
	
	@Before
	public void init(){
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
		
	}
	
	@Test
	public void addPostFunctionality() throws InterruptedException{
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Homepage.addPostBtn(driver).click();	
		
		
		Thread.sleep(2000);
		
		AddPost.postTitleField(driver).sendKeys(DataFile.postTitle);
		AddPost.postTitleConfirmBtn(driver).click();
		Thread.sleep(1000);
		AddPost.postCategoryBtn(driver).click();
		Thread.sleep(2000);
		AddPost.postSubCategoryBtn(driver).click();
		Thread.sleep(1000);
		AddPost.postSubSubCategoryBtn(driver).click();
		Thread.sleep(1000);
		AddPost.adTypeOfferingRadioBtn(driver).click();
		AddPost.productPriceField(driver).sendKeys(DataFile.productPrice);
		
		new Select(AddPost.productBrandDropdown(driver)).selectByVisibleText(DataFile.productBrand);
		new Select(AddPost.productCarrierDropdown(driver)).selectByVisibleText(DataFile.productCarrier);
		
		AddPost.forSaleByOwnerRadioBtn(driver).click();
		AddPost.productDescriptionField(driver).sendKeys(DataFile.productDescription);
		AddPost.changeLocation(driver).click();
		AddPost.location(driver).sendKeys(DataFile.productlocation);
		Thread.sleep(1000);
		AddPost.location(driver).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		AddPost.location(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		AddPost.postAdBtn(driver).click();
		Thread.sleep(1000);
		assertEquals("You have successfully posted your ad!", AddPost.postConfirmationMessage(driver).getText());
		DataFile.postId = AddPost.postIdSpan(driver).getText();
		
		//Thread.sleep(30000);
	}
}
