package Something;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ButtonInteraction {

	@Test
	public void main() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/buttons");
		WebElement ele= driver.findElementById("position");
		//getting the element location
		Point p = ele.getLocation();
		//taking x position
		int a= p.getX();
		//taking y position
		int b= p.getY();
		System.out.println("x ="+" "+a+" "+"y ="+" "+b);
		
		WebElement el= driver.findElementById("home");
		String str = el.getCssValue("background-color");
		System.out.println("Element colour in rgb value"+" "+str);
		
		Rectangle rec=el.getRect();
		Dimension re=rec.getDimension();
		int h=rec.getHeight();
		int w=rec.getWidth();
		System.out.println("Height = "+h+" "+"Width = "+w+" "+"width,height ="+" "+re);
		driver.quit();
	}
}
