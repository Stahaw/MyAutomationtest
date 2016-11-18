import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActionsCAPSLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		Actions abc = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		abc.click(element).build().perform();
		abc.keyDown(Keys.SHIFT).moveToElement(element).sendKeys("smallletters").build().perform();
		driver.quit();
	}

}
