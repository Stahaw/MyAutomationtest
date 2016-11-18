import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WaitExplicit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com");
		Thread.sleep(50000L);
		driver.findElement(By.xpath(".//*[@id='HomepageOverlay1115ModalClose']")).click();
		driver.close();
	}

}
