package Take_ScreenShot_Of_Failed_TC.Take_ScreenShot_Of_Failed_TC;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)
public class ScreenshotTest extends Base
{
	

	@BeforeMethod()
	public void setUp()
	{
		initailazation();
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(false, true);
	}

	
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
}
