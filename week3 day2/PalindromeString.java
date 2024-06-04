package week3.day2;
import java.lang.String;
public class PalindromeString {
	 public static boolean isPalindrome(String s) {
		 String rev="";
		 boolean ans =true;
		 for(int i=s.length()-1;i>=0;i--) {
			 rev=rev+s.charAt(i);
		 }
		 if(s.equals(rev)) {
			 ans=false;
		 }
		 return ans; 
	 }
	 public static void main(String[] args) {
		String s="A man,a plan,a canal:Panama";
		s=s.toLowerCase();
		boolean A=isPalindrome(s);
		System.out.println(A);
	}
}