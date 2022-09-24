package Something;

import org.testng.annotations.Test;

public class GroupsSe {
	//group tells which test case to run that can specify in xml file
	@Test(groups = {"smoke"})
	public void signup() 
	{
		System.out.println("signup");
	}
	
	@Test(groups = {"sanity"})
	public void emailId()
	{
		System.out.println("emailId");
	}
	
	@Test(groups = {"smoke"})
	public void password() 
	{
		System.out.println("password");
	}
	
	@Test(groups = {"sanity"})
	public void homepage() 
	{
		System.out.println("homepage");
	}
	
	@Test(groups = {"reg"})
	public void teacher() 
	{
		System.out.println("teacher");
	}
	
	@Test(groups = {"reg"})
	public void student() 
	{
		System.out.println("student");
	}
}
