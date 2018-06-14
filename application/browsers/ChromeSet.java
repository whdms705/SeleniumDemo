package com.test.demo.application.browsers;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.test.demo.application.events.CallbackEvent;

public class ChromeSet implements CallbackEvent {
	WebDriver driver;
	
	@Override
	public WebDriver init(){
		System.out.println("chrome setting start ");
		ChromeOptions options = new ChromeOptions();
		  
		// start  of  비밀번호 자동저장 해결 
		options.addArguments("chrome.switches", "--disable-extensions --disable-extensions-file-access-check --disable-extensions-http-throttling --disable-infobars --enable-automation --start-maximized");
		  
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		 
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		// end  of  비밀번호 자동저장 해결
		   
		
		System.setProperty("webdriver.chrome.driver","C:/Driver/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver(options);
		return driver;
	}

}
