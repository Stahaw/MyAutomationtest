
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Desiredcapabilities {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver;
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome.binary", "/Users/stakhivigor/Documents/Automation/Browsers/chromedriver");
		driver = new RemoteWebDriver(new URL("http://192.168.0.103:5566/wd/hub"), capabilities);
		driver.get("http://google.com");
		driver.getTitle();
	}

}
