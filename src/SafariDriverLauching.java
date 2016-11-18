import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariDriverLauching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//download SafariDriver.safariextz from http://selenium-release.storage.googleapis.com/index.html?path=2.45/
		
		WebDriver driver = new SafariDriver();
		driver.get("http://google.com");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
