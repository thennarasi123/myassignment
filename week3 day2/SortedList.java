package week3.day2;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class SortedList {
	public static void main(String[] args) {
		String[] array= {"HCL","Wipro","Aspire Systems","CTS"};
		List<String>list=new ArrayList<>();
		for(String value:array) {
			list.add(value);
		}
		Collections.sort(list);
		System.out.println("required output:");
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}		
	}
}
