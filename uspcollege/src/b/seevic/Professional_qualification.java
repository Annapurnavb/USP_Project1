package b.seevic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Professional_qualification {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Annapurna.Badiger\\eclipse-workspace\\ann\\uspcollege\\jars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://umbraco.uspcollege.ac.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[value='Accept']")).click();

		// login
		driver.findElement(By.xpath("/html/body/header/nav/ul[3]/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/header/nav/ul[3]/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.cssSelector("#EmailAddress")).sendKeys("ccsms@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("ccps1234");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/form/p[2]/input")).click();

		// dropdown step 2

		driver.findElement(By.id("single-select")).sendKeys("Professional Qualification");
		driver.findElement(By.id("single-select1")).sendKeys("Seevic");
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();

		// step 3

//		driver.findElement(By.id("PostBackModel_FirstName")).sendKeys("jck1");
//		driver.findElement(By.id("PostBackModel_MiddleName")).sendKeys("xmxxd");
//		driver.findElement(By.id("PostBackModel_LastName")).sendKeys("lokg");
//		driver.findElement(By.id("PostBackModel_AnotherName")).sendKeys("wfplok");
//		driver.findElement(By.id("PostBackModel_DateOfBirth")).sendKeys("29/11/1997");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[6]/div[2]/label")).click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[2]")).click();

		// step 4

//		driver.findElement(By.id("PostBackModel_FirstLineOfAddress")).sendKeys("asdss2");
//		driver.findElement(By.id("PostBackModel_SecondLineOfAddress")).sendKeys("axd34");
//		driver.findElement(By.id("PostBackModel_PostCode")).sendKeys("aw61plh");
//		driver.findElement(By.id("PostBackModel_TownOrCity")).sendKeys("tokyo");
//		driver.findElement(By.id("PostBackModel_MobileNumber")).sendKeys("2089949");
//		driver.findElement(By.id("PostBackModel_HomeNumber")).sendKeys("28700");
		// driver.findElement(By.id("PostBackModel_EmailAddress")).sendKeys("ccsms@gmail.com");

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[2]")).click();

		// step 5

//		driver.findElement(By.id("PostBackModel_ParentOrCarerFirstName")).sendKeys("kdcosdlki");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerLastName")).sendKeys("jdkkoklio");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerRelationshipToStudent")).sendKeys("dkjoupfdc");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerPhoneNumber")).sendKeys("00829582");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerEmailAddress")).sendKeys("pnnkkx@gmail.com");
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[6]/div[1]/label")).click();

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();

		// step 7

		driver.findElement(By.id("single-select")).sendKeys("Animal Care");
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/form/input[2]")).click();

		// step 8
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/form/div[2]/label")).click();
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/form/div[5]/input")).click();

		// step 9

//		driver.findElement(By.id("PostBackModel_LastCollegeOrSchool")).sendKeys("syuaddc");
//		driver.findElement(By.id("PostBackModel_Qualifications_0__Subject")).sendKeys("sikuye");
//		driver.findElement(By.id("PostBackModel_Qualifications_0__Type")).sendKeys("oish");
//		driver.findElement(By.id("PostBackModel_Qualifications_0__GradeOrPredictedGrade")).sendKeys("c");

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[6]/input")).click();

		// step 10

//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[2]/label")).click();
//		driver.findElement(By.id("single-select")).sendKeys("Indian");
//		driver.findElement(By.id("PostBackModel_Nationality")).sendKeys("kjddc");
//		driver.findElement(By.id("PostBackModel_Religion")).sendKeys("lodhjd");
//		driver.findElement(By.id("PostBackModel_FirstLanguage")).sendKeys("oiusjsc");
//		Thread.sleep(3000);
//
//		js.executeScript("window.scrollBy(0,300)");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[29]/div[1]/label")).click(); // Yes
//
//		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[34]/label")).click();// no
		js.executeScript("window.scrollBy(0,2800)");//

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();

		// step 11
		js.executeScript("window.scrollBy(0,3200)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div/form/input[1]")).click();

		// step 12
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[1]/label")).click();
		driver.findElement(By.id("single-select")).sendKeys("Family or Friend");
		driver.findElement(By.id("single-select1")).sendKeys("Early Years,ChildCare & Education");
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();
	}

}
