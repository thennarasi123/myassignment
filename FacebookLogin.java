package week1.day1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class FacebookLogin {
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			WebElement username=driver.findElement(By.id("email"));
			WebElement password=driver.findElement(By.id("pass"));
			WebElement login=driver.findElement(By.name("login"));
			username.sendKeys("testleaf.2023@gmail.com");
			password.sendKeys("Tuna@321");
			login.click();
			driver.findElement(By.linkText("Find your account and log in.")).click();
			System.out.println(driver.getTitle());
		}
	}

