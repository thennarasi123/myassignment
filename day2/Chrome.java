package week1.day2;

public class Chrome extends Browser {
	public void openIncognito() {
		System.out.println("opening incognito mode->from chrome class");
	}
	public void clearCache() {
		System.out.println("clearing the cache->from chrome class");
	}
	public static void main(String[] args) {
		Chrome chrome=new Chrome();
		chrome.openURL();
		chrome.browserName();
		chrome.browserVersion();
		chrome.closeBrowser();
		chrome.navigateBack();
		chrome.openIncognito();
		chrome.clearCache();
	}
}
