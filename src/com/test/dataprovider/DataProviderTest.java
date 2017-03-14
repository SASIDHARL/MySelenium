package com.test.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@DataProvider(name="userDetails")
    public Object[][] data(){
        return new Object[][]{
            {"data1@test.com","test123"},
            {"data2@test.com","test456"}
        };
    }

    @Test(dataProvider = "userDetails")
    public void login(String name, String pwd){
        System.out.println(data());
        System.out.println("Name from login test method ..."+name);
        System.out.println("Password from login test method ..."+pwd);
    }
}
