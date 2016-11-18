import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com");
			//driver.findElement(By.id("BELEBERA")).click();
			//wrong id for catch block
			Actions abc = new Actions(driver);
			WebElement element = driver.findElement(By.id("lst-ib"));
			abc.click(element).sendKeys("dfdsfsdf").build().perform();
			//driver.findElement(By.id("lst-ib")).sendKeys("sdfsdfd");
			driver.close();
		} catch(Exception TestFailedexception)
		{
		System.out.println("code for taking screenshots");	
		}
		

	}
	

}
