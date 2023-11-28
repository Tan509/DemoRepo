package mukesh_failed_tc_approach;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot_1 {
	static WebDriver driver;

	@Test(priority=1)
	public void Test() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	

		takeScreenShots(driver, "naukari1");
		driver.quit();
	}
	
	@Test(priority=2)
	public void Test2() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		
		driver.findElement(By.name("txtUsername1")).sendKeys("Tanvi");
		driver.findElement(By.name("txtPassword1")).sendKeys("fjgsdjkfgds");

		takeScreenShots(driver, "naukari333");
		driver.quit();
	}
	
	public static void takeScreenShots(WebDriver driver,String screenshotName) throws Exception
	{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file,new File("/Users/apple/Desktop/seed_chetak/EclipseWorkSpace_Practice/Take_ScreenShot_Of_Failed_TC/TestCase_ScreenShots/"+screenshotName+".png"));
				
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE == result.getStatus())
		{
			try {
				takeScreenShots(driver,result.getName());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		driver.quit();
	}
	

}
