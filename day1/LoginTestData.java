package week3.day1;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("please enter the username->from login test data");
	}
	public void enterPassword() {
		System.out.println("please enter the password->from login test data");
	}
	public static void main(String[] args) {
		LoginTestData login=new LoginTestData();
		login.enterCredentials();
		login.navigateToHomePage();
		login.enterUsername();
		login.enterPassword();	
	}
}
