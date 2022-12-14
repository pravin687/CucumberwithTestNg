package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Testbase;

public class LoginPage{
	private WebDriver driver;
	
	
	By email=By.xpath("//input[@id='modalusername']");
	By password=By.xpath("//input[@id='current-password']");
    By loginbutton=By.xpath("(//*[text()='Log in'])[2]");
    By incorrectmessage=By.xpath("//*[@class='EmailInput_email_error__IJxXf']");
    
    public LoginPage(WebDriver driver) {
    	this.driver=driver;
    	
    }
    
    public void loginToUrl() {
    	driver.get("https://profile.w3schools.com/log-in");
    }
    public void setemail(String emailid) {
    	
    	driver.findElement(email).sendKeys(emailid);
    	
    }
    
    public void setPassword(String pswd) {
    	
    	driver.findElement(password).sendKeys(pswd);
    }
    
    public void loginButton() {
    	driver.findElement(loginbutton).click();
    }
    
    public String incorrectcredmessage() {
    	String message =driver.findElement(incorrectmessage).getText();
    	return message;
    }
    
    public void  ApplicationLogin() {
    	
    	setemail("rtoor204@gmail.com");
    	setPassword("Abcde@12345");
    	loginButton();
    	
    }
    
    public String getTitle() {
    return	driver.getTitle();
    	
    }
}
