package Hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SearchHook {

    @Before
    public void setUp() {
        System.out.println("@Before getting executed..... Driver has been initialized");
    }

    @After
    public void tearDown() {
        System.out.println("@After getting executed .............. Driver is now being closed");
    }
}
