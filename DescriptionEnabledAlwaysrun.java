package Something;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DescriptionEnabledAlwaysrun {
	@Test(priority = 1)
	public void signup() 
	{
		System.out.println("signup");
		throw new NoAlertPresentException();
	}
	@Test(priority = 2)
	public void password() 
	{
		System.out.println("password");
	}
	@Test(dependsOnMethods = "signup",alwaysRun = true,description = "There is an No Alert Exception")
	public void emailId()
	{
		System.out.println("hdjefhjdfh"+"emailId");
	}
	@Test(priority = 3)
	public void submit() 
	{
		System.out.println("submit");
	}
}
