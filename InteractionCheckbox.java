package week1.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class InteractionCheckbox {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		WebElement check=driver.findElement(By.xpath("//span[text()='Checked']"));
		System.out.println(check.getText());
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'toggleswitch')]/div[2]")).click();
		Thread.sleep(2000);
		WebElement check1=driver.findElement(By.xpath("//span[text()='Checked']"));
		System.out.println(check1.getText());
		Thread.sleep(3000);
		System.out.println(driver.findElement
		(By.xpath("//div[contains(@class,'ui-selectbooleancheckbox')]//span[text()='Disabled']/parent::div/div/input")).isEnabled());
		driver.findElement(By.xpath("//div[@class='card']/h5[contains(text(),'State')]/following::div[@class='col-12']//div[contains(@id,'ajaxTriState')]")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//span[@class='ui-growl-title']//following-sibling::p")).getText());
		driver.findElement(By.xpath("//div[@role='combobox']/ul")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu')]/input")).sendKeys("lon");
		driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu')]/ul[@role='group']//label[text()='London']")).click();
		driver.findElement(By.xpath("//span[contains(@class,'circle-close')]")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}
}
