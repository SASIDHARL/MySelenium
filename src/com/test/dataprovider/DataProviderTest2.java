package com.test.dataprovider;

import org.testng.annotations.Test;

public class DataProviderTest2 {

    @Test(dataProvider = "userDetails",dataProviderClass=ExternalDataProviderTest.class)
    public void login(String name, String pwd){
        System.out.println("Name from login test method ..."+name);
        System.out.println("Password from login test method ..."+pwd);
    }
}
