package Something;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Work {
	
	@Test
	public void get() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load url
		driver.get("https://www.facebook.com/");
		driver.findElementById("pass").sendKeys("getting");
		driver.quit();
	}
}