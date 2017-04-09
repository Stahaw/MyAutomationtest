//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HandlingHeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HtmlUnitDriver driver = new  HtmlUnitDriver();
	    driver.get("http://qaclickacademy.com");
	    System.out.println(driver.getTitle());
	}

}
