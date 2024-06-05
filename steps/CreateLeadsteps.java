package steps;
import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadsteps extends BaseClass{
	@When("click on the crmsfa link")
	public void click_on_the_crmsfa_link(){
		System.out.println(driver);
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("click on leads link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@And("click on CreateLead link")
	public void click_on_CreateLead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@And("enter the company (.*)$")
	public void enter_the_company(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);    
	}
	@And("enter the firstname (.*)$")
	public void enter_the_firstname(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName); 
	}
	@And("enter the lastname (.*)$")
	public void enter_the_lastname(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
	@When("click on the submit button")
	public void click_on_the_submit_button() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("viewleads page should be displayed (.*)$")
	public void viewleads_page_should_be_displayed(String cName) {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}

}
