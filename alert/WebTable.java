package alert;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTable {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement fromele=driver.findElement(By.id("txtStationFrom"));
		fromele.clear();
		fromele.sendKeys("MAS",Keys.ENTER);
		WebElement toele=driver.findElement(By.id("txtStationTo"));
		toele.clear();
		toele.sendKeys("MDU",Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		List<WebElement>trainNamesList=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
		Set<String> set=new TreeSet<>();
		for(WebElement eachTrainName:trainNamesList) {
			String text=eachTrainName.getText();
			set.add(text);
		}
		System.out.println(trainNamesList.size());
		System.out.println(set.size());
		System.out.println(set);
		if(trainNamesList.size()!=set.size()) {
			System.out.println("Duplicates present");
		}else {
			System.out.println("No Duplicates");
		}
	}
}
