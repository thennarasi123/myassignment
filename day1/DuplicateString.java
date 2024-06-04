package week3.day1;
import java.lang.String;

public class DuplicateString {
	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week";	
		String[] words=text.split("\\s+");
		int count=0;
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])){
					words[j]="";
					count++;
				}
			}
		}
		if(count>0) {
			System.out.print("Modified text:");
			for(String word:words) {
				System.out.println(word + "");
			}
		}else {
			System.out.print("No duplicate found");
			}
		}
	}

		
			
