package week3.day2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Keys;
import java.util.Collections;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AjioList {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags",Keys.ENTER);
	driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
	Thread.sleep(3000);
	WebElement element=driver.findElement
	(By.xpath("//div[contains(@class,'filter-container')]/div[contains(@class,'filter')]//div[contains(@class,'length')]"));
	System.out.println(element.getText());
	List<WebElement>brands=driver.findElements(By.className("brand"));
	System.out.println("list of the brands:");
	for(WebElement brand:brands) {
		System.out.println(brand.getText());
	}
	List<WebElement>bagnames=driver.findElements(By.className("nameCls"));
	System.out.println("list of the bag names:");
	for(WebElement name:bagnames) {
		System.out.println(name.getText());
	}
	}
}
