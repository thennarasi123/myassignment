package week1.day1;

public class Browser {
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	public void loadUrl(){
		System.out.println("Application url loaded successfully");
		
	}
	public static void main(String[] args) {
		Browser lm = new Browser();
		System.out.println(lm.launchBrowser("google chrome"));
		lm.loadUrl();
	}
}
