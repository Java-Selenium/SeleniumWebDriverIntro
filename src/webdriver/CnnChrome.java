package webdriver;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class CnnChrome {

	 public WebDriver driver = null;
	 String actualTitle = "Breaking News, Daily News and Videos - CNN.com";

		@Before
		public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rrt\\selenium-browser-driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("http://www.cnn.com");
			driver.manage().window().maximize();
		}

		@Test
		public void test1() {
			System.out.println("Test 1 is ececuting..........");
			System.out.println(driver.getCurrentUrl());
			String expectedTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle, "title didn't match");
			driver.findElement(By.cssSelector("#search-button")).click();
			driver.findElement(By.cssSelector("#search-input-field")).sendKeys("Politics", Keys.ENTER);
		}
		
		@Test
		public void test2() {
			System.out.println("Test 2 is ececuting..........");
		    driver.findElement(By.cssSelector("#menu")).click();
			System.out.println(driver.getTitle());
			
		}
		
		@After
		public void tearDown() throws Exception {
			driver.close();
		}

}
