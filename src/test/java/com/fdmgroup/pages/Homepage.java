package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	public static WebElement signInLink(WebDriver driver){
		return driver.findElement(By.linkText("Sign In"));
	}
	
	public static WebElement profileIcon(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='MainContainer']/div[1]/div/header/div[3]/div[1]/div/div[2]/div/div[3]/div/button"));
	}
	
	public static WebElement addPostBtn(WebDriver driver){
		return driver.findElement(By.linkText("Post ad"));
	}
	
	public static WebElement KijijiLogoLink(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id='MainContainer']/div[1]/div/header/div[3]/div[1]/div/div[1]/a"));
	}
	
	public static WebElement postSearchField(WebDriver driver){
		return driver.findElement(By.id("SearchKeyword"));
	}
	
	public static WebElement postTypeDropdown(WebDriver driver){
		return driver.findElement(By.id("SearchCategory"));
	}
	
	public static WebElement postLocation(WebDriver driver){
		return driver.findElement(By.id("SearchLocationPicker"));
	}
	
	public static WebElement postProvince(WebDriver driver){
		return driver.findElement(By.xpath("//a[@title='Ontario (M - Z)']"));
	}
	
	public static WebElement postArea(WebDriver driver){
		return driver.findElement(By.xpath("//a[@title='Toronto (GTA)']"));
	}
	
	public static WebElement postCity(WebDriver driver){
		return driver.findElement(By.xpath("//a[@title='All of Toronto (GTA)']"));
	}
	
	public static WebElement CarsTruksMenu(WebDriver driver){
		return driver.findElement(By.xpath("//a[contains(@data-cat-id,'174')]"));
	}
	
	public static WebElement popUpLaterBtn(WebDriver driver){
		return driver.findElement(By.xpath("//button[text() = 'Later']"));
	}
	
	
	
	
}
