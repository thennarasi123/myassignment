package alert;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PromptAlert {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert1=driver.switchTo().alert();
		String msg=alert1.getText();
		System.out.println("alert the msg:"+msg);
		String getname="thennarasi";
		System.out.println("get the name:"+getname);
		alert1.sendKeys("thennarasi");
		alert1.accept();		 
		
	}
	

}
