package com.sauceDemo.TestCLasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.UtilityCLasses.ScreenshotClass; 
public class TC001_VerifyLoginFunctionality extends TestBaseClass 
{     
@Test     
public void loginFuntionality() throws IOException     
{          
//screenshot         
ScreenshotClass.takeScreenshot(driver);         
log.info("screenshot is taken");         
//validation         
String expectedTitle = "Swag Labs";    
//given             
String actualTitle = driver.getTitle();  
//actual         
log.info("doing validation-for login functionality");         
Assert.assertEquals(actualTitle, expectedTitle,"title not matched");     
} 

}
