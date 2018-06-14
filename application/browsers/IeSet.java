package com.test.demo.application.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.test.demo.application.events.CallbackEvent;

public class IeSet implements CallbackEvent {
	WebDriver driver;
	
	@Override
	public WebDriver init(){
		System.out.println("ie setting start ");
		System.setProperty("webdriver.ie.driver","C:/Driver/IEDriverServer_x64_2.53.1/IEDriverServer.exe");

		//브라우저에 대한 보안 설정
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capability.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		capability.setCapability("nativeEvents", false);    
		capability.setCapability("unexpectedAlertBehaviour", "accept");
		capability.setCapability("ignoreProtectedModeSettings", true);
		driver = new InternetExplorerDriver(capability);
		return driver;
	}

}
