package Hooks;


import io.cucumber.java.*;

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

    @AfterStep()
    public void refreshPage() {
        System.out.println("Refreshing Page");
    }

    @After()
    public void tearDownBrowser(Scenario scenario) {
        System.out.println("Current Scenario about to be executed "+scenario.getName()+ " Current Scenario status "+scenario.getStatus());
        System.out.println("@After getting executed .............. Driver is now being closed");
    }
}
