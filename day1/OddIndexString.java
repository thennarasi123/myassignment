package week3.day1;
import java.lang.String;
public class OddIndexString {
	public static void main(String[] args) {
		String input="changeme";
		char[] chars=input.toCharArray();
		for(int i=chars.length-1;i>=0;i--) {
			if(i%2!=0) {
				chars[i]=Character.toUpperCase(chars[i]);
				
			}
		}
		System.out.println(chars);
	}

}
