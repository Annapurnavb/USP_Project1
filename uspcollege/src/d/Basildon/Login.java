package d.Basildon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Annapurna.Badiger\\eclipse-workspace\\ann\\uspcollege\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://umbraco.uspcollege.ac.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[value='Accept']")).click();

		driver.findElement(By.xpath("/html/body/header/nav/ul[3]/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/header/nav/ul[3]/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.cssSelector("#EmailAddress")).sendKeys("lakl@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("qqqw1234");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/form/p[2]/input")).click();
		driver.quit();

	}

}
