package com.test.frameworkweb;

import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxDriverManager extends DriverManager{

	@Override
	protected void createDriver() {
		WebDriverManager.firefoxdriver().setup();
		// if required, firefox profile can be set here. 
		instance = new FirefoxDriver();
	}
	
}