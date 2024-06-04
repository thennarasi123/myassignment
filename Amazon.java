package week1.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import java.time.Duration;
public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for b");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		WebElement print=driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
		System.out.println(print.getText());
		driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[12]")).click();
		driver.findElement(By.xpath("//span[@class=\"a-button-text a-declarative\"]")).click();
		driver.findElement(By.xpath("//option[text()='Newest Arrivals']")).click();
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")).click();
		WebElement page=driver.findElement(By.xpath("(//div[@data-cy='title-recipe'])[1]"));
		System.out.println(page.getText());
		WebElement price=driver.findElement(By.xpath("(//div[@data-cy='price-recipe'])[1]"));
		System.out.println(price.getText());
		System.out.println(driver.getTitle());
		driver.close();
	}

}
