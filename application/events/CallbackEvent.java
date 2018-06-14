package com.test.demo.application.events;

import org.openqa.selenium.WebDriver;

public interface CallbackEvent {
	public WebDriver init();// 브라우저 초기 설정
}
