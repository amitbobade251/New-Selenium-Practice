package com.anshu.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage 
{

	public static WebDriver driver;
	public static String browser;
	public static String path= System.getProperty("user.dir");
	public static Properties p;
	public static String url;
	public static 	FileInputStream fis;
	
	public BasePage()
	{
	  if(driver==null)
	  {
			
			  try { 
				  fis= new FileInputStream(path+"\\src\\test\\resources\\prop.properties");
			      p=new Properties();
			      try { p.load(fis);
			  
			      } catch (IOException e)
			      { // TODO Auto-generated catch block
			  e.printStackTrace();
			  } 
			      } catch (FileNotFoundException e)
			  { 
			    	  e.printStackTrace();
			    	  }
			  if(p.getProperty("browser").equals("chrome")) 
			  {
			  WebDriverManager.chromedriver().setup(); 
			  //********Using to disable all notification pop ups
			  Map<String, Object> prefs = new HashMap<String, Object>();  
			  prefs.put("profile.default_content_setting_values.notifications", 2);
			  prefs.put("credentials_enable_service", false);
			  prefs.put("profile.password_manager_enabled", false);
			  ChromeOptions options = new ChromeOptions();
			  options.setExperimentalOption("prefs", prefs);
			  options.addArguments("--disable-extensions");
			  options.addArguments("--disable-infobars");

			  	driver = new ChromeDriver(options);
			  
			  //driver=new ChromeDriver(); 
			  }else if(p.getProperty("browser").equals("firefox"))
			  {
			  WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver(); 
			  }
			  driver.get(p.getProperty("url")); driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
	  
			/*
			 * WebDriverManager.chromedriver().setup(); driver =new ChromeDriver();
			 * driver.get("https://www.zoho.com");
			 */
	  
	  }
	  
	}  
  
  
	
}
