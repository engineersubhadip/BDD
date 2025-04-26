package DriverConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.dnd.DropTarget;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DriverManager {

    private static DriverManager instance;
    private static Lock lock = new ReentrantLock();
    private ThreadLocal<WebDriver> tLocal = new ThreadLocal<>();

    private DriverManager() {};

    public static DriverManager getInstance() {
        if (instance == null) {
            lock.lock();
            if (instance == null) {
                instance = new DriverManager();
            }
            lock.unlock();
        }
        return instance;
    }

    public void createDriver(String browserName) {
        if (tLocal.get() == null) {
            if (browserName.equalsIgnoreCase("Chrome")) {
                tLocal.set(new ChromeDriver());
            } else if (browserName.equalsIgnoreCase("Edge")) {
                tLocal.set(new EdgeDriver());
            } else if (browserName.equalsIgnoreCase("Firefox")) {
                tLocal.set(new FirefoxDriver());
            } else {
                throw new RuntimeException("Please provide valid browser name");
            }
        }
    }

    public WebDriver getDriver() {
        if (tLocal.get() != null) {
            return tLocal.get();
        }
        throw new RuntimeException("Please create the driver first");
    }

    public void quitDriver() {
        if (tLocal.get() != null) {
            tLocal.get().quit();
            tLocal.remove();
        }
    }
}
