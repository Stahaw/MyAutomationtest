import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverLaunching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/stakhivigor/Documents/Automation/Browsers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		//driver.close();
		

	}

}
