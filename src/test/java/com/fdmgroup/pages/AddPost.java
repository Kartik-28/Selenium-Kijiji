package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddPost {
	
	public static WebElement postTitleField(WebDriver driver){
		return driver.findElement(By.id("AdTitleForm"));
	}
	
	public static WebElement postTitleConfirmBtn(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='mainPageContent']/div/div/div/div[2]/div[1]/div[2]/div[1]/button"));
	}
	
	public static WebElement postCategoryBtn(WebDriver driver){
		return driver.findElement(By.xpath("//button[h5[contains(.,'Buy & Sell')]]"));
	}
	
	public static WebElement postSubCategoryBtn(WebDriver driver){
		return driver.findElement(By.xpath("//button[h5[contains(.,'Phones')]]"));
	}
	
	public static WebElement postSubSubCategoryBtn(WebDriver driver){
		return driver.findElement(By.xpath("//button[h5[contains(.,'Cell Phones')]]"));
	}
	
	public static WebElement productPriceField(WebDriver driver){
		return driver.findElement(By.id("PriceAmount"));
	}
	
	public static WebElement productDescriptionField(WebDriver driver){
		return driver.findElement(By.id("pstad-descrptn"));
	}
	
	public static WebElement adTypeOfferingRadioBtn(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='MainForm']/div[3]/ul/li[2]/div/label[1]"));
	}
	
	public static WebElement productBrandDropdown(WebDriver driver){
		return driver.findElement(By.id("phonebrand_s"));
	}
	
	public static WebElement productCarrierDropdown(WebDriver driver){
		return driver.findElement(By.id("phonecarrier_s"));
	}
	
	public static WebElement forSaleByOwnerRadioBtn(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='MainForm']/div[3]/ul/li[6]/div/label[1]"));
	}
	
	public static WebElement changeLocation(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='FESLocationModuleWrapper']/div/div/div/div[2]/div[1]/div[1]/div[2]/button"));
	}
	
	public static WebElement location(WebDriver driver){
		return driver.findElement(By.id("location"));
	}
	
	public static WebElement postAdBtn(WebDriver driver){
		return driver.findElement(By.name("saveAndCheckout"));
	}
	
	public static WebElement postConfirmationMessage(WebDriver driver){
		return driver.findElement(By.xpath("//h3[.='You have successfully posted your ad!']"));
	}
	
	public static WebElement postIdSpan(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='ViewItemPage']/div[2]/div/ul/li[7]/span"));
	}
	

}
