package week3.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class RadioButton1 {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/radio.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
	driver.findElement(By.xpath("//label[contains(text(),'Chennai')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[contains(text(),'Chennai')]")).click();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//div[contains(@class,'ui-state-active')]/preceding-sibling::div/input[@value='Option3']")).isSelected());
	System.out.println(driver.findElement
	(By.xpath("//div[contains(@class,'ui-g-12')]//div[contains(@class,'ui-state-active')]/preceding-sibling::div/input")).isSelected());
	driver.close();
}
}
