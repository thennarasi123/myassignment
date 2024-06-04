package javaproblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurence {
	public static boolean uniqueoccurence(int[] arr) {
		Map<Integer,Integer>countMap=new HashMap<>();
		for(int num:arr) {
			countMap.put(num,countMap.getOrDefault(num,0)+1);
		}
		Set<Integer>occurence=new HashSet<>(countMap.values());
		return occurence.size()==countMap.size();	
	}
	public static void main(String[] args) {
		int[] arr1= {1,2,2,1,1,3};
		int[]arr2= {1,2};
		int[] arr3= {-3,0,1,-3,1,1,1,-3,10,0};
		System.out.println(uniqueoccurence(arr1));
		System.out.println(uniqueoccurence(arr2));
		System.out.println(uniqueoccurence(arr3));
	}

}
