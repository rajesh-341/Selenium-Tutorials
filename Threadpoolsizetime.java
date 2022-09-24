package Something;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Threadpoolsizetime {
	//it tells the exception that we needed for the function
	@Test(expectedExceptions = (ArithmeticException.class))
	public void signup() 
	{
		System.out.println("signup");
//		throw new NoAlertPresentException();
	}
	//threadpoolsize tells how many thread can use at the same time
	@Test(invocationCount = 2, threadPoolSize = 2)
	public void another1() 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Website");
		driver.quit();
	}
	//timeout is used for single run 
	@Test(timeOut = 2000)
	public void another2() 
	{
		System.out.println("another2");
	}
	
}
