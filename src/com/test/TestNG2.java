package com.test;

import org.testng.annotations.Test;

public class TestNG2 {
	@Test(groups = { "init" })
	public void serverStartedOk() {}
	 
	@Test(groups = { "init" })
	public void initEnvironment() {}
	
	
	 
	@Test(dependsOnMethods = { "serverStartedOk" })
	public void method1() {}

}
