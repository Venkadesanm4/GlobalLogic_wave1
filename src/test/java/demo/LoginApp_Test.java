package demo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginApp_Test {
	WebDriver driver;

	@Test
	public void test() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("manz@mass.com");
		driver.findElement(By.id("Password")).sendKeys("mass123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		boolean loginlink = driver.findElement(By.linkText("manz@mass.com")).isDisplayed();
		assertEquals(true, loginlink);
	}
		@BeforeClass
		public void beforeClass1() {

			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/login");
			driver.manage().window().maximize();
		}
		
	

	private void beforeClass() {
		// TODO Auto-generated method stub
		
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}