package week6.day1;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
	public class BaseClass {
		public ChromeDriver driver ;
		public String fileName;
        @BeforeMethod
		public void preCondition() {
			
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
		}
		
		@AfterMethod
		public void postCondition() {
			driver.close();

		}
		
		@DataProvider(name="fetchData")
		public String[][] sendData() throws IOException {
	      return  ReadExcel.readData(fileName);
		}


	}




