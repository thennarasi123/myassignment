package week1.day2;

public class Edge extends Browser {
	public void takeSnap() {
		System.out.println("taking the snap->from edge class");
	}
	public void clearCookies() {
		System.out.println("clearing the cookies->from edge class");
	}
	public static void main(String[] args) {
		Edge edge=new Edge();
		edge.openURL();
		edge.browserName();
		edge.browserVersion();
		edge.closeBrowser();
		edge.navigateBack();
		edge.takeSnap();
		edge.clearCookies();
	}
}
