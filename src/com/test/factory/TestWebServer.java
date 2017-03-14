package com.test.factory;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWebServer{
	@Parameters("number-of-times" )
	@Test()
	public void accessPage(int numberOfTimes) {
		while (numberOfTimes-- > 0) {
			// access the web page
		}
	}

}
