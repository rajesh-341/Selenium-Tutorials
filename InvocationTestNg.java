package Something;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationTestNg {
	//invocationCount it tells no of time the test case to iterate
	//invocationTimeOut it tells how much time total iteration to take place
	@Test(invocationCount = 2,invocationTimeOut = 20000)
	public void RunTestMultiple() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/buttons");
		WebElement web =driver.findElementById("home");
		String dim =web.getText();
		System.out.println(dim);
	}
}
