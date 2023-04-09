package Pratice.NopCommerce.Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pratice.NopCommerce.PageObject.loginPageObj;
import io.cucumber.java.*;

public class baseclass {

	public WebDriver Driver;
	public loginPageObj lp;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver's\\chromedriver.exe");
		Driver = new ChromeDriver();
		
	}
	
	@After
	public void tearDown() {
		Driver.quit();
	}
	
}
