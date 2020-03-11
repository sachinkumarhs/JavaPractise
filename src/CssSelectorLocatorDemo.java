import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sachin_Official\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		//1. choose a locator:- cssSelector , css expression=  input#identifierId
		By ref=By.cssSelector("input#identifierId");
		WebElement element=driver.findElement(ref);
		element.sendKeys("sadadsdwedewd");
		Thread.sleep(6000);
		driver.close();
	}

}
