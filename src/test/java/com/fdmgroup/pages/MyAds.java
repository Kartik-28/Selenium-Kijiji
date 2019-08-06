package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fdmgroup.testData.DataFile;

public class MyAds {
	
	public static WebElement myAddPageLi(WebDriver driver){
		return driver.findElement(By.xpath("//li[contains(text(),'My Ads')]"));
	}
	
	public static WebElement myAddDeleteBtn(WebDriver driver){
		return driver.findElement(By.xpath("//li[@data-qa-id = 'ad-id-" + DataFile.postId + "']/div[2]/div/ul/li[2]/button"));
	}
	
	public static WebElement findAdsInputfield(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='mainPageContent']/div/div/div/div[2]/div/input"));
	}
	
	public static WebElement deletionSuccessMesage(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='mainPageContent']/div/div/div/div[3]/ul/li/div/span/div/h3"));
	}
	
	public static WebElement deletionReasonListElement(WebDriver driver){
		return driver.findElement(By.xpath("//li[contains(text(),'Not selling it anymore')]"));
	}
	
	public static WebElement logoutOutBtn(WebDriver driver){
		return driver.findElement(By.xpath("//button[text() = 'Log Out']"));
	}

}
