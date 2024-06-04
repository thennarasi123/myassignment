package alert;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Tatacliq {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[text()='Ask me later']")).click();
		WebElement ele=driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(ele).perform();
		Thread.sleep(3000);
		WebElement ele1=driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		Actions builder1=new Actions(driver);
		builder1.moveToElement(ele1).perform();
		WebElement drag=driver.findElement(By.xpath("//div[text()='Featured brands']"));
		WebElement drop=driver.findElement(By.xpath("//div[text()='Casio']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).click().perform();
		WebElement data=driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select s=new Select(data);
		s.selectByVisibleText("New Arrivals");
		driver.findElement(By.xpath("//div[text()='Men']")).click();
		Thread.sleep(3000);
		List<WebElement>priceList=driver.findElements(By.className("ProductDescription__priceHolder"));
		Thread.sleep(2000);
		String mainPrice=priceList.get(0).getText();
		mainPrice=mainPrice.replaceAll("[\\D]","");
		System.out.println("Price old:"+mainPrice);
		for(WebElement element:priceList)
		{
			String text=element.getText();
			System.out.println("Prices of the men's watches are:"+text);
		}
       	String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])")).click();
		Set<String>childWindow=driver.getWindowHandles();
		List<String>cWindow=new ArrayList<>(childWindow);
		driver.switchTo().window(cWindow.get(1));
		Thread.sleep(3000);
		WebElement firstprice=driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3"));
		String newPrice=firstprice.getText();
		newPrice=newPrice.replaceAll("[\\D]","");
		System.out.println("Price new:"+newPrice);
		if(mainPrice.equals(newPrice)) {
			System.out.println("Price matches");
		}else {
			System.out.println("Price does not match");
			
		}
		driver.findElement(By.xpath("//span[contains(text(),'ADD TO BAG')]")).click();
		WebElement count=driver.findElement(By.xpath("//span[contains(@class,'cartCount')]"));
		String cartCount=count.getText();
		System.out.println("number of items in the cart is:"+cartCount);
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		Thread.sleep(2000);
		File screenshotAS=driver.getScreenshotAs(OutputType.FILE);
		File desc=new File("./snap/imagename.png");
		FileUtils.copyFile(screenshotAS, desc);
		
		
		
		
		
			
		}
		
		
		
	}


