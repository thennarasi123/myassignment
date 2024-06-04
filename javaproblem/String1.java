package javaproblem;
import java.util.HashMap;
public class String1 {
	public static int firstUniqueChar(String s) {
		HashMap<Character,Integer>map=new HashMap<>();
		for(char c:s.toCharArray()) {
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		for(int i=0;i<s.length();i++) {
			if(map.get(s.charAt(i))==1) {
				return i;
				}
			}
		return -1;
		
	}
	public static void main(String[] args) {
		String s="leetcode";
		System.out.println(firstUniqueChar(s));
		String s1="loveleetcode";
		System.out.println(firstUniqueChar(s1));
		String s2="aabb";
		System.out.println(firstUniqueChar(s2));
		}

}
