package Hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class SearchHook {

    @Before()
    public void setUpBrowser(Scenario scenario) {
        System.out.println("Current Scenario about to be executed "+scenario.getName()+ " Current Scenario status "+scenario.getStatus());
        System.out.println("@Before getting executed..... Driver has been initialized");
    }

    @BeforeStep()
    public void takeScreenshotBefore() {
        System.out.println("Takes screenshot before every step");
    }

    @After()
    public void tearDownBrowser(Scenario scenario) {
        System.out.println("Current Scenario about to be executed "+scenario.getName()+ " Current Scenario status "+scenario.getStatus());
        System.out.println("@After getting executed .............. Driver is now being closed");
    }
}
