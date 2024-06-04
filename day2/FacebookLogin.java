package week1.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebookLogin {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("thennarasi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("N");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8967452310");
		driver.findElement(By.id("password_step_input")).sendKeys("Nandri");
		Select daySelect=new Select(driver.findElement(By.id("day")));
		daySelect.selectByValue("11");
		Select monthSelect=new Select(driver.findElement(By.id("month")));
		monthSelect.selectByVisibleText("Jul");
		Select yearSelect=new Select(driver.findElement(By.id("year")));
		yearSelect.selectByValue("2000");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}
}

