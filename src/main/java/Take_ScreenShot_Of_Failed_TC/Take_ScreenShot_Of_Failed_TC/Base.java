package Take_ScreenShot_Of_Failed_TC.Take_ScreenShot_Of_Failed_TC;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
public static WebDriver driver; //create variable of webdriver
	
	public static void initailazation()
	{
		//In this initailazation method launch your google chrome and all 
		
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);

	}
	
	public void failed(String getMethodName) throws Exception
	{
		//typecast driver to TakesSceenshot
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("/Users/apple/Desktop/seed_chetak/EclipseWorkSpace_Practice/Take_ScreenShot_Of_Failed_TC/TestCase_ScreenShots/"+ getMethodName +".jpg"));
	}


}
