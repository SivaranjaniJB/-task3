package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class launch {
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "C:\\Users\\san\\Desktop\\seleniumclass");
	WebDriver driver= new InternetExplorerDriver();
	driver.get("https://www.facebook.com/");
	driver.quit();
	
}
}
