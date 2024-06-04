package week3.day2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList {
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
	List<WebElement> mobileList=driver.findElements(By.className("a-price-whole"));
	List<Integer>list=new ArrayList<>();
	for(WebElement each : mobileList) {
		String text=each.getText();
		String replaceAll=text.replaceAll(",", "");
		int actMobilePrice=Integer.parseInt(replaceAll);
		list.add(actMobilePrice);
	}
	Collections.sort(list);
	System.out.println("The least mobile price is:"+list.get(0));

	}
}
	
	
			
