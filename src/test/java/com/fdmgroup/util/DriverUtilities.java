package com.fdmgroup.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtilities {
	
	private static DriverUtilities driverUtilities;
	private WebDriver driver;

	private DriverUtilities() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static DriverUtilities getInstance(){
		if(driverUtilities == null)
			{
			driverUtilities = new DriverUtilities();
			}
		return driverUtilities;
	}
	
	public WebDriver getDriver(){
		if(driver == null)
			createDriver();
		
		return driver;
	}

	private void createDriver() {
		String driverName = getDriverName();
		
		switch(driverName){
		
		case "Google Chrome":
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			this.driver = new ChromeDriver();
			break;
			
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			this.driver = new FirefoxDriver();
			break;
			
		default:
			System.out.println("Not an appropriate driver");
		}
		
	}

	private String getDriverName() {
		Properties config = new Properties();
		String driverName="";
		
		try {
			config.load(new FileInputStream("config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String key : config.stringPropertyNames()){
			if(key.equals("browser"))
				driverName=config.getProperty(key);
				
		}
		return driverName;
	}
	
	
	

}
