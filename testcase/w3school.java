package testcase;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class w3school {
	public static ChromeDriver driver;
	
	
	@DataProvider(name="data")
	public String[][] rundata() throws IOException{
		XSSFWorkbook wb=new XSSFWorkbook("C:\\Testleaf\\Selenium\\data\\Book1.xlsx");
		XSSFSheet sheet=wb.getSheet("sheet1");
		int rowNum=sheet.getLastRowNum();
		int cellCount=sheet.getRow(rowNum).getLastCellNum();
		System.out.println(rowNum);
		System.out.println(cellCount);
		String[][] data=new String[rowNum][cellCount];
		for(int i=1; i<=rowNum; i++) {
			for(int j=0; j<cellCount; j++) {
				String stringCellValue=sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=stringCellValue;
				System.out.println(stringCellValue);
			}
		}
		wb.close();
		return data;
			
		}
	
	@Test(dataProvider="data")
	public void addElements(String FN,String EM,String AD,String CT,String ST,String ZP,
			String EP,String CV,String EXM,String CN,String NC)throws IOException,InterruptedException{
		    ChromeOptions options=new ChromeOptions();
		    options.addArguments("--disable-notifications");
		    driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
			Thread.sleep(2000);
			driver.switchTo().frame("iframeResult");
			Actions builder=new Actions(driver);	
			Thread.sleep(2000);
			builder.moveToElement(driver.findElement(By.id("fname")));
		driver.findElement(By.id("fname")).sendKeys(FN);
		driver.findElement(By.id("email")).sendKeys(EM);	
		driver.findElement(By.id("adr")).sendKeys(AD);
		driver.findElement(By.id("city")).sendKeys(CT);
		driver.findElement(By.id("state")).sendKeys(ST);
		driver.findElement(By.id("zip")).sendKeys(ZP);
		driver.findElement(By.id("expyear")).sendKeys(EP);
		driver.findElement(By.id("cvv")).sendKeys(CV);
		driver.findElement(By.id("expmonth")).sendKeys(EXM);
		driver.findElement(By.id("ccnum")).sendKeys(CN);
		driver.findElement(By.id("cname")).sendKeys(NC);
		Thread.sleep(2000);
		driver.close();
		}
			
		}
		

