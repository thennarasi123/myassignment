package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		boolean flag=true;
		int n=25;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				System.out.println("Non-Prime");
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Prime");
		}
	}
}
