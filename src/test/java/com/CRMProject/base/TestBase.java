package com.CRMProject.base;



import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.CRMProject.util.TestUtil;


 

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public TestBase(){ 
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("Users/sangitaraniamatya/eclipse-workspace/CucumberFreeCRMPOM/src/test/java/com/CRMProject/config/config.properties");
			prop.load(ip);
		
		} catch (IOException a) {
			a.getMessage();
		}
	}
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		System.setProperty("webdriver.chrome.driver","/Users/sangitaraniamatya/Downloads/chromedriver" );
	 		
	 	 driver = new ChromeDriver();
	 	 //driver.get("https://www.freecrm.com/index.html");
		//if(browserName.equals("chrome")){
			//System.setProperty("webdriver.chrome.driver",
					//"/Users/sangitaraniamatya/Downloads/chromedriver");
					
			//driver = new ChromeDriver(); 
		//}
		//else if(browserName.equals("FF")){
			//System.setProperty("webdriver.gecko.driver", "/Users/sangitaraniamatya/Downloads/geckodriver");	
			//driver = new FirefoxDriver(); 
		
	
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	
	
	

	
	}


