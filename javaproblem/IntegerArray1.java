package javaproblem;
import java.util.HashSet;
public class IntegerArray1 {
	public static boolean containsDuplicate(int[] nums){
		HashSet<Integer>set=new HashSet<>();
		for(int num:nums) {
			if(!set.add(num)) {
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		System.out.println(containsDuplicate(nums));
	}
}
