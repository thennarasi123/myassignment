package week3.day2;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class IntersectionList {
	public static void main(String[] args) {
		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
		List<Integer>list1=new ArrayList<>();
		List<Integer>list2=new ArrayList<>();
		for(int num:array1){
			list1.add(num);			
		}
		for(int num:array2) {
			list2.add(num);
		}
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i).equals(list2.get(i))) {
				System.out.println("equal value found:" + list1.get(i));
			}
		}
	}

}
