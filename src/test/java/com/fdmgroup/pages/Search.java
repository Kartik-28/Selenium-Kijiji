package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fdmgroup.testData.DataFile;

public class Search {

	public static WebElement getPost(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@data-ad-id ='" + DataFile.postId + "']"));
	}

	public static WebElement postIdSpan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='ViewItemPage']/div[3]/div/ul/li[7]/span"));
	}

	public static boolean verifyPostIsPresent(WebDriver driver) {

		try {

			getPost(driver);

			return true;

		} catch (Exception e) {

			return false;

		}

	}

}
