package com.utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import com.pages.Logpage;

public class Helpclass {
    public static WebDriver driver;
    
    public static void setupdriver() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        PageFactory.initElements(driver, new Logpage());
        
    }

    public static void teardowndriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
