package b.seevic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A_level {

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
		driver.findElement(By.cssSelector("#EmailAddress")).sendKeys("sms@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("akps1234");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/form/p[2]/input")).click();
		
		// dropdown step 2

		driver.findElement(By.id("single-select")).sendKeys("A-Level");
		driver.findElement(By.id("single-select1")).sendKeys("Seevic");
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();
		
		

		// step 3
//		driver.findElement(By.id("PostBackModel_FirstName")).sendKeys("dfd");
//		driver.findElement(By.id("PostBackModel_MiddleName")).sendKeys("dfdmd");
//		driver.findElement(By.id("PostBackModel_LastName")).sendKeys("sddg");
//		driver.findElement(By.id("PostBackModel_AnotherName")).sendKeys("egvk");
//		driver.findElement(By.id("PostBackModel_DateOfBirth")).sendKeys("01/09/2018");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[6]/div[2]/label")).click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[2]")).click();
		
        //step 4
//		driver.findElement(By.id("PostBackModel_FirstLineOfAddress")).sendKeys("ascs12");
//		driver.findElement(By.id("PostBackModel_SecondLineOfAddress")).sendKeys("axddsj34");
//		driver.findElement(By.id("PostBackModel_PostCode")).sendKeys("aw615fh");
//		driver.findElement(By.id("PostBackModel_TownOrCity")).sendKeys("kampen");
//		driver.findElement(By.id("PostBackModel_MobileNumber")).sendKeys("208949949");
//		driver.findElement(By.id("PostBackModel_HomeNumber")).sendKeys("28780");
		// driver.findElement(By.id("PostBackModel_EmailAddress")).sendKeys("sms@gmail.com");

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[2]")).click();

		// step 5
		
//		driver.findElement(By.id("PostBackModel_ParentOrCarerFirstName")).sendKeys("dcolki");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerLastName")).sendKeys("lkkokio");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerRelationshipToStudent")).sendKeys("dofdc");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerPhoneNumber")).sendKeys("02sl82");
//		driver.findElement(By.id("PostBackModel_ParentOrCarerEmailAddress")).sendKeys("ahkx@gmail.com");
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		js2.executeScript("window.scrollBy(0,500)");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[6]/div[1]/label")).click();

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();
		
		
		//step 6
		driver.findElement(By.id("single-select")).sendKeys("Film Studies");
		driver.findElement(By.id("single-select1")).sendKeys("Fine Art");
		driver.findElement(By.id("single-select2")).sendKeys("Fine Art");

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[4]/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();
		
		//step 8
		
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[1]/label")).click();

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[5]/input")).click();
		
		//step 9
		
//		driver.findElement(By.id("PostBackModel_LastCollegeOrSchool")).sendKeys("adaddc");
//		driver.findElement(By.id("PostBackModel_Qualifications_0__Subject")).sendKeys("sce");
//		driver.findElement(By.id("PostBackModel_Qualifications_0__Type")).sendKeys("ensh");
//		driver.findElement(By.id("PostBackModel_Qualifications_0__GradeOrPredictedGrade")).sendKeys("p");

        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[6]/input")).click();
        
        
       // step 10
        
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/div[2]/label")).click();
//		driver.findElement(By.id("single-select")).sendKeys("White and Black African");
//		driver.findElement(By.id("PostBackModel_Nationality")).sendKeys("zdcdc");
//		driver.findElement(By.id("PostBackModel_Religion")).sendKeys("zzdhjd");
//		driver.findElement(By.id("PostBackModel_FirstLanguage")).sendKeys("lsdsjsc");
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
		driver.findElement(By.id("single-select")).sendKeys("Lakeside");
		driver.findElement(By.id("single-select1")).sendKeys("Creative & Digital");
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/form/input[1]")).click();

	}

}
