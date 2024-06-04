package week3.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public interface DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);
		String leadID=driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[contains(@class,'x-grid3-row')][1]//td[contains(@class,'x-grid3-cell-first')]//a")).getText();
		System.out.println(leadID);
		driver.findElement(By.xpath("//div[@class='x-grid3-body']/div[contains(@class,'x-grid3-row')][1]//td[contains(@class,'x-grid3-cell-first')]//a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String record=driver.findElement(By.xpath("//div[@class='x-panel-bbar']//div[@class='x-paging-info']")).getText();
		System.out.println(record);
		
		
				
}
}
