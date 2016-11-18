import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingRadiobuttonsdinamically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		for(int i=0;i<count;i++){
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			String texttoclick = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if(texttoclick.equals("Cheese")){
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();	
			}
		}
		driver.quit();
	}

}
