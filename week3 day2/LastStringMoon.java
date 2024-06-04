package week3.day2;
import java.lang.String;

public class LastStringMoon {
	public static int lengthofLastWord(String s) {
		int lastIndex = s.lastIndexOf(' ');
		return s.length()-lastIndex-1;
}
	public static void main(String[] args) {
		String s="fly me to the moon";
		int length=lengthofLastWord(s);
		System.out.println("Length of last word:" +length);		
	}

}

