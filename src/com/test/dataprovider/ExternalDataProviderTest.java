package com.test.dataprovider;

import org.testng.annotations.DataProvider;

public class ExternalDataProviderTest {

    @DataProvider(name="userDetails")
    public static Object[][] data(){
        return new Object[][]{
                {"data1@test.com","test123"},
                {"data2@test.com","test456"}
        };
    }
}
