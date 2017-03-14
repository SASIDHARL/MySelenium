package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG1 {
	
	
	@Test(dataProvider ="testdata")
	public void testuser(String n1, Integer n2){
		
		System.out.println(n1 +" "+n2);
	}
@DataProvider(name = "testdata")
public Object[][] createData1() {
	return new Object[][] {
		 { "Cedric", new Integer(36) },
		   { "Anne", new Integer(37)},

	};

	
}

}
