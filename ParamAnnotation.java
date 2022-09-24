package Something;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamAnnotation {
	@Parameters({"emailId","password"})
	@Test
	public void printing(String a, String b) 
	{
		System.out.println(a+" "+b);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?biz=false&cc=IN&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3Dsign_in_no_continue%26pli%3D1&dsh=S84506050%3A1662717818435821&flowEntry=SignUp&flowName=GlifWebSignIn&service=accountsettings");
		
		driver.findElementByName("Username").sendKeys(a);
		driver.findElementByName("Passwd").sendKeys(b);
		
	}
}
