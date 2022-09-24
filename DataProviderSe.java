package Something;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSe {
	//passing dynamic values using data provider
	@DataProvider(name = "login")
	public String[][] sendData() {
		String[][] data = new String[2][2];
		data[0][0] = "rajesh@gmail.com";
		data[0][1] = "password1";
		
		data[1][0] = "karthi@gmail.com";
		data[1][1] = "password2";
		
		return data;
	}
	@Test(dataProvider = "login")
	public void signin(String email, String pass) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?biz=false&cc=IN&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3Dsign_in_no_continue%26pli%3D1&dsh=S84506050%3A1662717818435821&flowEntry=SignUp&flowName=GlifWebSignIn&service=accountsettings");
		driver.findElementByName("Username").sendKeys(email);
		driver.findElementByName("Passwd").sendKeys(pass);
	}

}
