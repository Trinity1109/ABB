package tests;

import org.testng.annotations.Test;

import com.test.Utility.TestUtil;

import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static util.ExtentTestManager.startTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.Iterator; 

//import com.mifmif.common.regex.util.Iterator;

import pages.LoginPage;

public class LoginTests extends BaseTest {
    @Test(priority = 0, description = "Valid Login Scenario with correct username and password.")
    public void validLoginTest(Method method) throws InterruptedException {
        //ExtentReports Description
       // startTest(method.getName(), "Valid Login Test");
    	String emailidinput="test098@yopmail.com";
    	String password="Testing@123";
    	homePage
    		.openABBemart();
    		        loginPage.logintoABBemart(emailidinput, password);
       Thread.sleep(5000);
        //String username = myaccountPage.verifyMyAccountUserName();
      //  assertEquals(username, "Hi, test4!");
      	
    }
 
}