package week1.day2;

public class Safari extends Browser {
	public void readerMode() {
		System.out.println("entering the readermode->from safari class");
	}
	public void fullScreenMode() {
		System.out.println("entering full screen->from safari class");
	}
	public static void main(String[] args) {
		Safari safari=new Safari();
		safari.openURL();
		safari.browserName();
		safari.browserVersion();
		safari.closeBrowser();
		safari.navigateBack();
		safari.readerMode();
		safari.fullScreenMode();
	}
}
