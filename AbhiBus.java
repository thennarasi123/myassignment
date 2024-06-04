package week1.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import java.time.Duration;
public class AbhiBus {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		WebElement e=driver.findElement(By.xpath("//h5[text()='Swamy Ayyappa Travels']"));
		System.out.println(e.getText());
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		driver.findElement(By.xpath("(//button[@class='btn bus-info-btn filled primary sm inactive button'])[1]")).click();
		WebElement seat=driver.findElement(By.xpath("(//div[@class='text-grey'])[1]"));
		System.out.println(seat.getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='L1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='label'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='label'])[1]")).click();
		WebElement selec=driver.findElement(By.xpath("//span[text()='Seat Selected :']"));
		System.out.println(selec.getText());
		WebElement fare=driver.findElement(By.xpath("//span[text()='Base Fare :']"));
		System.out.println(fare.getText());
		System.out.println(driver.getTitle());
		driver.close();		
		
	}

}
