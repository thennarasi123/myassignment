package week1.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HandlingDropDown {
	
	
		
		/* 
		 * Confirm whether the dropdown WebElement is inside the <select> tag
		 * Locate that particular dropdown and assign it to a variable
		 * Instantiate Select class and pass the DropDown WebElement 
		 * Use the methods of Select Class to click the dropdown option
		 *      selectByIndex()
		 *      selectByVisibleText()
		 *      selectByValue()
		 * 
		 */
		public static void main(String[] args) {
			
			// Launch the chrome browser
			ChromeDriver driver = new ChromeDriver();
			// Load the url -> get() -> Load a new web page in the current browser window
			driver.get("http://leaftaps.com/opentaps/control/main");
			// to maximize the window
			driver.manage().window().maximize();
			// Locate the username text field
			WebElement eleUsername = driver.findElement(By.id("username"));
			// perform the action on the WebELement
			eleUsername.sendKeys("Demosalesmanager");
			// enter the password in the password field
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			// Click on the Login button
			driver.findElement(By.className("decorativeSubmit")).click();
			//to get the title -> getTitle() -> Get the title of the current page. 
			System.out.println(driver.getTitle());
			// click crmsfa link
			driver.findElement(By.partialLinkText("SFA")).click();
			// click Leads link
			driver.findElement(By.linkText("Leads")).click();
			// click CreateLead Link
			driver.findElement(By.linkText("Create Lead")).click();
			// enter the company name
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			// enter the firstname
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
			// enter the lastname
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
			// locate the source dropdown
			WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
			// Instantiate the Select class
			Select sec = new Select(sourceDD);
			// To select the Direct Mail dropdown options use Select class methods
			sec.selectByIndex(3);
			// To select the Car and Driver option inside Market Campaign dropdown
			WebElement marketDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select sec1 = new Select(marketDD);
			sec1.selectByVisibleText("Car and Driver");
			// To select by using value 
			WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select sec2 = new Select(industryDD);
			sec2.selectByValue("IND_MEDIA");
			
			
			// to close the browser -> close() -> Close the current window
			//driver.close();
			
		}

	}

