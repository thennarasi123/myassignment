package javaproblem;

public class String2 {
	public static int numjewelsinstones(String jewels,String stones) {
		int count=0;
		for(char stone:stones.toCharArray()) {
			if(jewels.indexOf(stone)!=-1) {
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		String jewels="aA";
		String stones="aAabbbb";
		System.out.println(numjewelsinstones(jewels,stones));
		String jewels1="z";
		String stones1="ZZ";
		System.out.println(numjewelsinstones(jewels1,stones1));
		
	}

}
