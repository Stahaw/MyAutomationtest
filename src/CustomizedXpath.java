import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomizedXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.findElement(By.xpath(".//*[@id='reg_form_box']/div[1]/div[1]/div[1]/div/input")).sendKeys("testtesttest");
		driver.close();
	}

}
