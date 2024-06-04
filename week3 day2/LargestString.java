package week3.day2;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class LargestString {
	public static void main(String[] args) {
		int[] array= {3,2,11,4,6,7};
		List<Integer>list=new ArrayList<>();
		for(int num:array) {
			list.add(num);
		}
		Collections.sort(list);
		System.out.println("second element from the last:"+list.get(list.size()-2));
		System.out.println("second largest number:"+list.get(list.size()-2));			
	}
}
