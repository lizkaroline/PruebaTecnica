package PruebaTecnicaC;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestsC {

	private WebDriver driver;
	
	@Before		
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/empleos-testing/");
	}
	
	@Test	
	public void testch() {
		WebElement searchbox = driver.findElement(By.name("search_location"));
		WebElement button = driver.findElement(By.className("search_submit"));
		
		searchbox.sendKeys("Bogota");
		button.click();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		assertEquals("Bogota",driver.getTitle());
		
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	}
}
