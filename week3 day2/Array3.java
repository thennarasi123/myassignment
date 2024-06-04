package week3.day2;
import java.util.ArrayList;
public class Array3 {
	public static int findSingleNumber(int[] nums){
        int result=0;
        for(int num:nums){
            result ^=num;
        }
        return result;
        }
        public static void main(String[] args){
            int[] nums={1};
            System.out.println(findSingleNumber(nums));
        }
    }

