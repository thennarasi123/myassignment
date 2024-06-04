package javaproblem;
import java.util.HashMap;
public class Array2 {
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
		int[] nums= {1,0,1,1};
		int k= 1;
		System.out.println(containsnearbyDuplicate(nums,k));
	}

}
