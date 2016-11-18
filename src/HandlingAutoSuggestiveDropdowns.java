import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAutoSuggestiveDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://fantasycricket.dream11.com/IN/");
		WebDriverWait wd = new WebDriverWait(driver, 10);
		driver.findElement(By.id("m_rtxtEmail1")).sendKeys("a");
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul")));
		driver.findElement(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul/li[4]/p")).click();
	}

}
