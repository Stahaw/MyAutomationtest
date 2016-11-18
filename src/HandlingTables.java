import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();		
		driver.get("http://www.espncricinfo.com/ci/engine/match/415281.html");
		WebElement table = driver.findElement(By.xpath(".//*[@id='full-scorecard']/div[2]/div"));
		List<WebElement> numrows = table.findElements(By.tagName("tr"));
		System.out.println("number rows" + " " + numrows.size());
		int i = 0;
			for(WebElement eachrow:numrows){
				List<WebElement> eachcolomn= eachrow.findElements(By.tagName("td"));
				i++;
				System.out.println("number rows" + i + "td row" + eachcolomn.size());
					for(WebElement text:eachcolomn){
						System.out.println(text.getText());
					}
			}
		
		driver.close();
	}

}
