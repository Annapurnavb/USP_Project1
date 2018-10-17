package zcom.usp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_usp {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Annapurna.Badiger//eclipse-workspace//ann//uspcollege//jars//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://umbraco.uspcollege.ac.uk/");
		

	}

}
