package TeeDee.TanusreeMaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class IpadTest {
	
	@Test
	public void AEMtest()
	{
		System.out.println("We are in 1st function of Ipad Class");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://github.com/");
		driver.findElement(By.cssSelector("a[href='/login']")).click();
		
	
	
	};
	
	@Test
	public void ReactTest()
	{
		System.out.println("We are in 2nd function of Ipad Class");
	};
	
	@Test
	public void RDpageTest()
	{
		System.out.println("We are in 3rd function of Ipad Class");
	};
	
	
	
	

}
