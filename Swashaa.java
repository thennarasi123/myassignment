package week1.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;
public class Swashaa {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.swashaa.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement searchbox=driver.findElement(By.id("Search"));
		searchbox.sendKeys("bracelet");
		searchbox.submit();
		
	}

}
