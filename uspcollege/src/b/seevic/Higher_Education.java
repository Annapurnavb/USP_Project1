package b.seevic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Higher_Education {

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
		driver.findElement(By.cssSelector("#EmailAddress")).sendKeys("ana@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("rruqs1234");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/form/p[2]/input")).click();

		// dropdown step 2

		driver.findElement(By.id("single-select")).sendKeys("Higher Education");// seevic//
		driver.findElement(By.id("single-select1")).sendKeys("Seevic");
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();

		// step 3

//		driver.findElement(By.id("PostBackModel_FirstName")).sendKeys("knowman");
//		driver.findElement(By.id("PostBackModel_MiddleName")).sendKeys("ksowgirl");
//		driver.findElement(By.id("PostBackModel_LastName")).sendKeys("pksnmli");
//		driver.findElement(By.id("PostBackModel_AnotherName")).sendKeys("okndk");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("#PostBackModel_NationalInsuranceNumber")).sendKeys("1123");
//
//		driver.findElement(By.id("PostBackModel_DateOfBirth")).sendKeys("21/09/1987");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,2000)");
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[7]/div[2]/label")).click();
		js.executeScript("window.scrollBy(0,700)");// 500
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[2]")).click();

		// step 4

//		driver.findElement(By.id("PostBackModel_FirstLineOfAddress")).sendKeys("dsa12");
//		driver.findElement(By.id("PostBackModel_SecondLineOfAddress")).sendKeys("adoddsud6");
//		driver.findElement(By.id("PostBackModel_PostCode")).sendKeys("we22df");
//		driver.findElement(By.id("PostBackModel_TownOrCity")).sendKeys("lossiem12");
//		driver.findElement(By.id("PostBackModel_MobileNumber")).sendKeys("98949949");
//		driver.findElement(By.id("PostBackModel_HomeNumber")).sendKeys("28d990s0j");
//		// driver.findElement(By.id("PostBackModel_EmailAddress")).sendKeys("ana@gmail.com");
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[2]")).click();

		// step 5

//		driver.findElement(By.id("PostBackModel_ParentOrCarerFirstName")).sendKeys("posdlki");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerLastName")).sendKeys("lklio");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerRelationshipToStudent")).sendKeys("ldkofdc");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerPhoneNumber")).sendKeys("02472 9582");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerEmailAddress")).sendKeys("lnnkkx@gmail.com");
//		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[6]/div[1]/label")).click();

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();

		// step 7
		driver.findElement(By.id("single-select")).sendKeys("Applied Biology");
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[2]")).click();

		// step 8

		// driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[3]/label")).click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[5]/input")).click();

		// step 9
//        driver.findElement(By.id("PostBackModel_LastCollegeOrSchool")).sendKeys("sjaxh");
//		driver.findElement(By.id("PostBackModel_Qualifications_0__Subject")).sendKeys("uujd");
//		driver.findElement(By.id("PostBackModel_Qualifications_0__Type")).sendKeys("ba engish");
//		driver.findElement(By.id("PostBackModel_Qualifications_0__GradeOrPredictedGrade")).sendKeys("B+");
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[6]/input")).click();
		
		//step 10
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[2]/label")).click();
//		driver.findElement(By.id("single-select")).sendKeys("Any other whitebackround");
//		driver.findElement(By.id("PostBackModel_Nationality")).sendKeys("kmjhdc");
//		driver.findElement(By.id("PostBackModel_Religion")).sendKeys("fokklid");
//		driver.findElement(By.id("PostBackModel_FirstLanguage")).sendKeys("spmnhsc");
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
		driver.findElement(By.id("single-select")).sendKeys("Convey & Benfeet Times");
		driver.findElement(By.id("single-select1")).sendKeys("Life & Spotrs Sciences");
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();

	}

}
