package steps;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
public class BaseClass extends AbstractTestNGCucumberTests {
	public static ChromeDriver driver;
	@BeforeMethod
	public void preCondition() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");	
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
		
	}

}
