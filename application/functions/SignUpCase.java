package com.test.demo.application.functions;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.test.demo.application.events.FuctionTestCase;
import com.test.service.ReadExcelFileToList;

public class SignUpCase implements FuctionTestCase {
	Logger log = Logger.getLogger(SignUpCase.class);
	
	@Override
	public void callme(WebDriver driver,String url){
		try{
			HashMap<Integer,String> mapCase = ReadExcelFileToList.readExcelData("C:\\Á¶ÀºÈ£\\test.xls");
			driver.get(url);
		}catch(Exception e){
			
		}
		
		
	}
}
