package Hooks;

import DriverConfig.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class ApplicationHook {

    @Before()
    public void setUp() throws IOException {

        Properties properties = new Properties();
        try (FileInputStream fileInput = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties")) {
            properties.load(fileInput);
        } catch(Exception e) {
            e.printStackTrace();
            System.exit(1); // the whole JVM shuts down
        }
        String browserName = properties.getProperty("browser");
        String browserURL = properties.getProperty("url");
        DriverManager.getInstance().createDriver(browserName);
        System.out.println("Driver : "+DriverManager.getInstance().getDriver());
        WebDriver driver = DriverManager.getInstance().getDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.manage().window().maximize();
        driver.get(""+browserURL+"");
    }

    @After()
    public void tearDown() {
        DriverManager.getInstance().quitDriver();
    }
}
