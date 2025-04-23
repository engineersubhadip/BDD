package Hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SearchHook {

    @Before(order=1)
    public void setUpBrowser() {
        System.out.println("@Before getting executed..... Driver has been initialized");
    }

    @Before(order=2)
    public void setUpDataBase() {
        System.out.println("@Before getting executed..... DataBase has been initialized");
    }

    @After(order=2)
    public void tearDownDataBase() {
        System.out.println("@After getting executed .............. DataBase is now being closed");
    }

    @After(order=1)
    public void tearDownBrowser() {
        System.out.println("@After getting executed .............. Driver is now being closed");
    }
}
