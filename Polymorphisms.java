package week1.day2;

public class Polymorphisms {
	String msg;
	String status;
	public void reportStep(String msg,String status) {
		System.out.println(msg);
		System.out.println(status);
	}
	public void reportStep(String msg,String status,boolean snap) {
		System.out.println(msg);
		System.out.println(status);
		System.out.println(snap);
	}
	public static void main(String[] args) {
		Polymorphisms pm=new Polymorphisms();
		pm.reportStep("Workdone","done");
		pm.reportStep("testdone","done",false);
	}
}
