package Helper;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static Helper.Helper.driver;

// This class can be used as reference how to initialize driver and run test cases

public class Example {
    @BeforeTest
    public static void initializeDriver(){
        Helper.createInstance();
    }
    @Test (priority = 1)
    public void run(){
        System.out.println("Website Opened");
    }

    @AfterTest
    public void close(){
        System.out.println("Driver initialized");
        driver.quit();
    }
}
