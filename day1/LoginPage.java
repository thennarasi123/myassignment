package week3.day1;

public class LoginPage extends BasePage {
	public void performCommonTasks() {
		System.out.println("perform common task->from loginpage");
	}
	public static void main(String[] args) {
		LoginPage login=new LoginPage();
		login.clickElement();
		login.enterText();
		login.findElement();
		login.performCommonTasks();
		
	}

}
