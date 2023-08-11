package com.testExecution;


import org.testng.annotations.Test;

import com.base.TestBase;
import com.pageObject.PageObjectManger;

public class TS001 extends TestBase {

	
	@Test(priority =1)
	private void setUp() {
		browserLaunch("chrome");
	}
	
	@Test(priority =2)
	private void aUrl() {
		launchUrl("https://www.amazon.in");
	}
	
	@Test(priority = 3)
	private void searchAProduct() {
		
		inputValues(PageObjectManger.getPom().getHom().getSearchP(), "Books");
	}
	
}
