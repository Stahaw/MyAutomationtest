import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectingValuefromCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/flights");
		driver.findElement(By.xpath(".//*[@id='start_date_sec']/span[3]")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[6]/td[2]/a")).click();
			int i = 0;
			while(i<5){
				driver.findElement(By.xpath(".//*[@id='adult_count']/a[2]")).click();
				i++;
			}
	}

}
