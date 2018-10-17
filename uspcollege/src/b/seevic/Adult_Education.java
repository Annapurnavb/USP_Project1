package b.seevic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adult_Education {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Annapurna.Badiger\\eclipse-workspace\\ann\\uspcollege\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://umbraco.uspcollege.ac.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[value='Accept']")).click();

		// login
		driver.findElement(By.xpath("/html/body/header/nav/ul[3]/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/header/nav/ul[3]/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.cssSelector("#EmailAddress")).sendKeys("nna@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("puqs1234");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/form/p[2]/input")).click();

		// dropdown step 2

		driver.findElement(By.id("single-select")).sendKeys("Adult Education");// seevic//
		driver.findElement(By.id("single-select1")).sendKeys("Seevic");
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();

		// step 3
//		driver.findElement(By.id("PostBackModel_FirstName")).sendKeys("nowman");
//		driver.findElement(By.id("PostBackModel_MiddleName")).sendKeys("sowgirl");
//		driver.findElement(By.id("PostBackModel_LastName")).sendKeys("ksnmli");
//		driver.findElement(By.id("PostBackModel_AnotherName")).sendKeys("kndk");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("#PostBackModel_NationalInsuranceNumber")).sendKeys("1123");
//
//		driver.findElement(By.id("PostBackModel_DateOfBirth")).sendKeys("27/09/1987");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,2000)");
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[7]/div[2]/label")).click();
		js.executeScript("window.scrollBy(0,700)");//500
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[2]")).click();
		
		
		// step 4

//		driver.findElement(By.id("PostBackModel_FirstLineOfAddress")).sendKeys("addsa12");
//		driver.findElement(By.id("PostBackModel_SecondLineOfAddress")).sendKeys("adoddddsud6");
//		driver.findElement(By.id("PostBackModel_PostCode")).sendKeys("we2112df");
//		driver.findElement(By.id("PostBackModel_TownOrCity")).sendKeys("lossiemouth12");
//		driver.findElement(By.id("PostBackModel_MobileNumber")).sendKeys("ff8949949");
//		driver.findElement(By.id("PostBackModel_HomeNumber")).sendKeys("28d990sj");
//		// driver.findElement(By.id("PostBackModel_EmailAddress")).sendKeys("nna@gmail.com");
//		
//		driver.findElement(By.id("PostBackModel_EmergencyContactFirstName")).sendKeys("aadkj");
//		driver.findElement(By.id("PostBackModel_EmergencyContactLastName")).sendKeys("sdsd9");
//		driver.findElement(By.id("PostBackModel_EmergencyContactRelationship")).sendKeys("zdsd");
//		driver.findElement(By.id("PostBackModel_EmergencyContactPhoneNumber")).sendKeys("2392480");
//		driver.findElement(By.id("PostBackModel_EmergencyContactEmailAddress")).sendKeys("djisd@gamil.com");

		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[2]")).click();
		
		// step 7
		
		driver.findElement(By.id("single-select1")).sendKeys("AAT Accounting Level 2");
		driver.findElement(By.id("single-select2")).sendKeys("AAT Accounting Level 2");
		driver.findElement(By.id("single-select3")).sendKeys("AAT Accounting Level 2");
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[2]")).click();
		
		
		//step 9
//		driver.findElement(By.id("PostBackModel_Qualifications_0__Subject")).sendKeys("dsjd");
//		driver.findElement(By.id("PostBackModel_Qualifications_0__Type")).sendKeys("basic engish");
//		driver.findElement(By.id("PostBackModel_Qualifications_0__GradeOrPredictedGrade")).sendKeys("D");
//		driver.findElement(By.id("PostBackModel_Qualifications_0__Year")).sendKeys("1689");
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[5]/input")).click();
		
		//step 10
		
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[2]/label")).click();
//		driver.findElement(By.id("single-select")).sendKeys("Gypsy or Irish Traveller");
//		driver.findElement(By.id("PostBackModel_Nationality")).sendKeys("mjhdc");
//		driver.findElement(By.id("PostBackModel_Religion")).sendKeys("okklid");
//		driver.findElement(By.id("PostBackModel_FirstLanguage")).sendKeys("pmnhsc");
//		Thread.sleep(3000);
//
//		js.executeScript("window.scrollBy(0,300)");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[29]/div[1]/label")).click(); // Yes
//
//		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[34]/label")).click();// no
		js.executeScript("window.scrollBy(0,2800)");//2800

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();
		
		// step 11
		js.executeScript("window.scrollBy(0,3200)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div/form/input[1]")).click();
		
		
		// step 12
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[1]/label")).click();
		driver.findElement(By.id("single-select")).sendKeys("Bus stop advert");
		driver.findElement(By.id("single-select1")).sendKeys("Health,Care & Medical");
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();
		
		
		
		
	}

}
