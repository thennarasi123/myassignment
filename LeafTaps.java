package week1.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class LeafTaps {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("thennarasi123@");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		Select industrySelect=new Select(driver.findElement(By.name("industryEnumId")));
		industrySelect.selectByVisibleText("Computer Software");
		Select ownershipSelect=new Select(driver.findElement(By.name("ownershipEnumId")));
		ownershipSelect.selectByVisibleText("S-Corporation");
		Select sourceSelect=new Select(driver.findElement(By.xpath("//select[@id='dataSourceId']")));
		sourceSelect.selectByValue("LEAD_EMPLOYEE");
		Select campaignSelect=new Select(driver.findElement(By.id("marketingCampaignId")));
		campaignSelect.selectByIndex(6);
		Select stateSelect=new Select(driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']")));
		stateSelect.selectByValue("TX");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.close();
	}
}
		
		
		
		
		
		
		
		
		

