package javaproblem;

public class FirstRepeatedChar {
	public static char firstrepeatedchar(String s) {
		int[] occurence=new int[26];
		for(char c:s.toCharArray()) {
			occurence[c-'a']++;
			if(occurence[c-'a']==2) {
				return c;
			}
		}
		return ' ';
		
	}
	public static void main(String[] args) {
		String s="abccbaacz";
		String s1="abcdd";
		System.out.println(firstrepeatedchar(s));
		System.out.println(firstrepeatedchar(s1));
	}

}
