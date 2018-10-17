package b.seevic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Foundation_Learing {

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
		driver.findElement(By.cssSelector("#EmailAddress")).sendKeys("lloop@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("nnao1234");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/form/p[2]/input")).click();
		
		//step 2
		driver.findElement(By.id("single-select")).sendKeys("Foundation Learing");
		driver.findElement(By.id("single-select1")).sendKeys("Seevic");
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();
		
		// step 3
//		driver.findElement(By.id("PostBackModel_FirstName")).sendKeys("lklod");
//		driver.findElement(By.id("PostBackModel_MiddleName")).sendKeys("lsddxddd");
//		driver.findElement(By.id("PostBackModel_LastName")).sendKeys("dsldg");
//		driver.findElement(By.id("PostBackModel_AnotherName")).sendKeys("wegvk");
//		driver.findElement(By.id("PostBackModel_DateOfBirth")).sendKeys("15/09/1972");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[6]/div[2]/label")).click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[2]")).click();
		
		//step 4
//		
//		driver.findElement(By.id("PostBackModel_FirstLineOfAddress")).sendKeys("alocs12");
//		driver.findElement(By.id("PostBackModel_SecondLineOfAddress")).sendKeys("oiuj34");
//		driver.findElement(By.id("PostBackModel_PostCode")).sendKeys("we81d5fh");
//		driver.findElement(By.id("PostBackModel_TownOrCity")).sendKeys("wsbagoda");
//		driver.findElement(By.id("PostBackModel_MobileNumber")).sendKeys("090989849949");
//		driver.findElement(By.id("PostBackModel_HomeNumber")).sendKeys("287870087");
		// driver.findElement(By.id("PostBackModel_EmailAddress")).sendKeys("lloop@gmail.com");

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[2]")).click();
		
		//step 5
		
//		driver.findElement(By.id("PostBackModel_ParentOrCarerFirstName")).sendKeys("mdosdlki");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerLastName")).sendKeys("mkkoklio");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerRelationshipToStudent")).sendKeys("kloupfdc");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerPhoneNumber")).sendKeys("0242909582");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerEmailAddress")).sendKeys("apk@gmail.com");
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		js2.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[6]/div[1]/label")).click();

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();
		
	//step 7
		
		driver.findElement(By.id("single-select")).sendKeys("Pathways");
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/form/input[2]")).click();

		
	// step 8
		
		//driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/form/div[3]/label")).click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/form/div[5]/input")).click();
		
		// step 9
//		driver.findElement(By.id("PostBackModel_LastCollegeOrSchool")).sendKeys("oyksjx");
//		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(3000);
//		driver.findElement(By.id("PostBackModel_Qualifications_0__Subject")).sendKeys("piujsd");
//		driver.findElement(By.id("PostBackModel_Qualifications_0__Type")).sendKeys("csadde");
//		driver.findElement(By.id("PostBackModel_Qualifications_0__GradeOrPredictedGrade")).sendKeys("E");
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/form/div[6]/input")).click();
		
		//step 10
		
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[2]/label")).click();
//		driver.findElement(By.id("single-select")).sendKeys("Pakistani");
//		driver.findElement(By.id("PostBackModel_Nationality")).sendKeys("Cadcdc");
//		driver.findElement(By.id("PostBackModel_Religion")).sendKeys("Nkhjd");
//		driver.findElement(By.id("PostBackModel_FirstLanguage")).sendKeys("ksosjsc");
//		Thread.sleep(3000);
//
//		js.executeScript("window.scrollBy(0,300)");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[29]/div[1]/label")).click(); // Yes
//
//		js.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[34]/label")).click();// no
		js.executeScript("window.scrollBy(0,2800)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();
		
		// step 11
		js.executeScript("window.scrollBy(0,3200)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div/form/input[1]")).click();
		
		// step 12
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"single-select\"]")).sendKeys("Google");
		driver.findElement(By.id("single-select1")).sendKeys("Other");
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();
		
		
		
		
	}

}
