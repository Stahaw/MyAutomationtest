import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Asserts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='email']")).isDisplayed());
		driver.quit();

	}

}
