package Something;

import org.testng.annotations.Test;

public class TestngPriority {

	@Test(priority = 1)
	public void signup() 
	{
		System.out.println("signup");
	}
	@Test(priority = 2)
	public void emailId()
	{
		System.out.println("emailId");
	}
	@Test(priority = 3)
	public void password() 
	{
		System.out.println("password");
	}
	@Test(priority = 4)
	public void submit() 
	{
		System.out.println("submit");
	}
}
