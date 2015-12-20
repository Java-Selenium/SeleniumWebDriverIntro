package webdriver;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CnnAppMainMethod {

	public static WebDriver driver = null;
	
	public static void main(String[] args) {
	        driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("http://www.cnn.com");
			driver.manage().window().maximize();
			System.out.println(driver.getCurrentUrl());
			driver.findElement(By.cssSelector("#search-button")).click();
			driver.findElement(By.cssSelector("#search-input-field")).sendKeys("Politics", Keys.ENTER);
			driver.close();

	}

}
