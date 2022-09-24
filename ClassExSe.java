package Something;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassExSe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://en.wikipedia.org/wiki/Website");
		driver.findElement(new By.ByXPath("/html/body/div[4]/div[1]/div[2]/nav[1]/div/ul/li[2]/a/span")).click();
		driver.manage().window().maximize();
		String str=driver.getCurrentUrl();
		System.out.println(str);
		if (str.equals("https://en.wikipedia.org/w/index.php?title=Website&action=edit")) 
		{
			System.out.println("You are allowed");
		}
		else
		{
			System.out.println("You are not allowed");
		}
	}
}
