package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadsteps extends BaseClass {
	@When("click on crmsfa link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	    
	}
	@And("click on Leads link")
	public void click_on_Leads_link() {
		driver.findElement(By.linkText("Leads")).click();

	}
	@And("click on find leads link")
	public void click_on_find_leads_link() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@And("enter the phonenumber(.*)$")
	public void enter_the_phonenumber(String phnum) {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phnum);
	}
	@And("click on find leads link1")
	public void click_on_find_leads_link1() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@And("click on first resulting leadID")
	public void click_on_first_resulting_lead_id() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@When("click on edit link")
	public void click_on_edit_link() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@And("updateleadform the companyname(.*)$")
	public void updateleadform_the_companyname(String cname) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
	}
	@Then("click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.name("submitButton")).click();
	}

}
