package javaproblem;
import java.util.HashMap;
public class Array1 {
	public static boolean containsnearbyDuplicate(int[] nums,int k) {
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])&& Math.abs(map.get(nums[i])-i)<=k) {
				return true;	
			}
			map.put(nums[i],i);
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		int[] nums= {1,2,3,1};
		int k= 3;
		System.out.println(containsnearbyDuplicate(nums,k));
	}

}
