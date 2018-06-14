package com.test.demo.application.events;

import java.util.ArrayList;
import java.util.List;

import com.test.demo.application.browsers.ChromeSet;
import com.test.demo.application.browsers.IeSet;
import com.test.demo.application.functions.SignUpCase;



public class EventApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �������� ���� ����Ʈ
		List<CallbackEvent> drivers = new ArrayList<CallbackEvent>(){ {
			    add(new ChromeSet());
				add(new IeSet());
		} };
		
	    // ��ɺ� ���ø���Ʈ
		List<FuctionTestCase> testCases = new ArrayList<FuctionTestCase> () {{
				add(new SignUpCase());
		}};
		
		String url="https://www.linkedin.com/m/login/";
		
	    for(CallbackEvent driver:drivers){
	    	
		    for(FuctionTestCase testCase: testCases){
			    
		    	testCase.callme(driver.init(),url);
		    	
		    }
	   
	    }

	}

}
