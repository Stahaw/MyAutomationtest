import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContainsTextTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.findElement(By.linkText("Forgot account?")).click();
		driver.close();
}
}