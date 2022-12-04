package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	
	public static WebDriver driver;
	@BeforeMethod
	public void launchDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test
	public void Test1() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 1 Title is "+driver.getTitle());
	}
	@Test
	public void Test2() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 2 Title is "+driver.getTitle());
	}
	@Test
	public void Test3() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 3 Title is "+driver.getTitle());
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
