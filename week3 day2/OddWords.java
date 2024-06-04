package week3.day2;

public class OddWords {
	public static void main(String[] args) {
		String test="I am a software tester";
		String[] str=test.split("");
		for(int i=0;i<str.length;i++) {
			if(i % 2 !=0) {
				char[]ch=str[i].toCharArray();
				for(int j=0;j<ch.length;j++) {
					if(j % 2==0) {
						System.out.println(ch[j]);
					}
				}
				System.out.print("");	
			}		
		}
	}
}
