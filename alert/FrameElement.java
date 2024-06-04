package alert;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FrameElement {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert1=driver.switchTo().alert();
		String msg=alert1.getText();
		System.out.println("alert the message:"+msg);
		alert1.accept();
		String verifyMsg=driver.findElement(By.id("demo")).getText();
		if(verifyMsg.contains("OK")) {
			System.out.println("alert is accepted");}
		else {
			System.out.println("alert is not accepted");
		}
	}

}
