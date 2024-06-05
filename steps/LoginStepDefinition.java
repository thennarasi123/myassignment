package steps;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass {
	@Given("enter the username as {string} and password as {string}")
	public void enter_the_username_as_demosalesmanager_and_password_as_crmsfa(String uName,String pWord) {
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
	}
	@When("click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Homepage should be displayed")
	public void homepage_should_be_displayed() {
		String title=driver.getTitle();
		if(title.contains("Leaftaps")) {
			System.out.println("Homepage is verfied");
		}
		else {
			System.out.println("homepage is not verfied");
		}
	}
	@But("errormessage should be displayed")
	public void errormessage_should_be_displayed() {
		String text=driver.findElement(By.id("errorDiv")).getText();
		if(text.contains("Errors")) {
			System.out.println("errormessage is verfied");
		}
		else {
			System.out.println("errormessage is not verfied");
		}
		
	}
}
