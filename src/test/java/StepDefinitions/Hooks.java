package StepDefinitions;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Hooks {
    
    public static WebDriver driver;
    private Properties properties = new Properties();

    @Before
    public void setUpDriver() {
        System.out.println("Inside Here Helllo !!!!!!!!!!!!");
        try {
            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "config.properties");
            properties.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String browserName = properties.getProperty("browser");
        String browserURL = properties.getProperty("browserURL");

        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Please enter valid browser");
        }

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.manage().window().maximize();
        driver.get(browserURL);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}