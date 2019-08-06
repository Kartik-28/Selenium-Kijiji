package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
	
	public static WebElement emailOrNicknameField(WebDriver driver){
		return driver.findElement(By.name("emailOrNickname"));
	}
	
	public static WebElement passwordField(WebDriver driver){
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement signInButton(WebDriver driver){
		return driver.findElement(By.id("SignInButton"));
	}

}
