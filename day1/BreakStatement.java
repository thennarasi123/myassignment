package week1.day1;

public class BreakStatement {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==3){
			System.out.println("three");
			break;
			}
			System.out.println(i);
			}
			System.out.println("out of the loop");
	}
}
