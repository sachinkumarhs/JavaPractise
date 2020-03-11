import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadWebPage {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin_Official\\chromedriver_win32\\chromedriver.exe");
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin_Official\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		
		/*driver.findElement(By.name("q")).sendKeys("Shiva tandava stotra mp3");
		driver.findElement(By.id("lga")).click();*/
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("gb_g")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("h-c-header__nav-li-link ")).click();;
		driver.close();
		
		
		

	
	}

}
