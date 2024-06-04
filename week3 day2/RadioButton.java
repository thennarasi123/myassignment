package week3.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class RadioButton {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.findElement(By.xpath("//span[text()='Disabled']/parent::button")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//span[text()='Submit']/parent::button")).getLocation());
		System.out.println(driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background"));
		System.out.println(driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize());
		System.out.println(driver.getTitle());
	}
}
