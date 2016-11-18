import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HttpHttps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxProfile pron = new FirefoxProfile();
		pron.setAcceptUntrustedCertificates(true);
		WebDriver driver = new FirefoxDriver(pron);
		driver.get("http://google.com");
		driver.close();
	}

}
