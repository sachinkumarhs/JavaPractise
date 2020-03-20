import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class TestNGFirst {
	
	WebDriver driver;
	
	@BeforeMethod
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin_Official\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
	}
	
	@Test()
	@Parameters({"email","pass"})
	public void Login(String email,String pass) {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
}
	
	
	
	@AfterMethod
	public void logout() {
		
		driver.quit();
		
		
	}

}
