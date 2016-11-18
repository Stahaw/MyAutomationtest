import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingStaticdropdownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com/");
		Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		dropdown.selectByIndex(3);
		dropdown.selectByValue("8");
		dropdown.selectByVisibleText("4 Adults");
		driver.close();
	}

}
