package Something;

import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;

public class DependsOnTesNg {
	@Test
	public void signup() 
	{
		System.out.println("signup");
	}
	@Test(dependsOnMethods = "password")
	public void submit() 
	{
		System.out.println("submit");
	}
	@Test(dependsOnMethods = "emailId")
	public void password() 
	{
		System.out.println("password");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods = "signup")
	public void emailId()
	{
		System.out.println("emailId");
	}
	
	
}
