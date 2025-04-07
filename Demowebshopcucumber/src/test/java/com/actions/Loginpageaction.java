package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.testng.Assert;
import com.pages.Logpage;

public class Loginpageaction {
    Logpage lpl = new Logpage();
    String k;
    public void setun(String un) {
        lpl.username.sendKeys(un);
    }
    public void setpw(String pw) {
        lpl.password.sendKeys(pw);
    }

    public void clicklogin() {
        lpl.log.click();
    }

    public void Login(String un, String pw) {
        this.setun(un);
        this.setpw(pw);
        this.clicklogin();
    }
    public void getmsg() {
    	Properties prop = new Properties();
        try {
            File file = new File("C:\\Users\\ADMIN\\eclipse-TestngAssessment\\Demowebshopcucumber\\src\\test\\resources\\Features\\text.properties"); 
            FileInputStream fis = new FileInputStream(file);
            prop.load(fis);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        k=prop.getProperty("value");
        String actual="Welcome to the new Tricentis store!";
        Assert.assertEquals(k,actual);
        System.out.println("assertion success");
    }
}
