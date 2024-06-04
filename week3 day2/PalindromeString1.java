package week3.day2;
import java.lang.String;
public class PalindromeString1 {
	public static boolean isPalindrome(String s) {
		 String rev="";
		 boolean ans =false;
		 for(int i=s.length()-1;i>=0;i--) {
			 rev=rev+s.charAt(i);
		 }
		 if(s.equals(rev)) {
			 ans=true;
		 }
		 return ans; 
	 }
	 public static void main(String[] args) {
		String s="race a car";
		s=s.toLowerCase();
		boolean A=isPalindrome(s);
		System.out.println(A);
	}
}

