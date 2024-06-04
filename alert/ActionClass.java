package alert;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionClass  {
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize() ;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement scrollele=driver.findElement(By.linkText("Conditions of Use & Sale"));
	Actions builder=new Actions(driver);
	builder.scrollToElement(scrollele).perform();
	System.out.println(scrollele.getText());

}
}
