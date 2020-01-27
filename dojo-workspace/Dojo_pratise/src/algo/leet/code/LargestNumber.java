package algo.leet.code;

import java.util.Arrays;
import java.util.Comparator;

class LargerNumberComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		String order1 = o1+o2;
		String order2 = o2+o1; 
		//System.out.println(order1 +" "+ order2+" -> "+order2.compareTo(order1));
		return order2.compareTo(order1);
	}
	
}
public class LargestNumber {
	 public static String largestNumber(int[] nums) {
	        String [] strs = new String [nums.length];
	        
	        for(int i=0;i<strs.length;i++) {
	        	strs[i] = Integer.toString(nums[i]);
	        }
	        
	        Arrays.sort(strs, new LargerNumberComparator());
	        System.out.println(Arrays.toString(strs));
	        
	        String result ="";
	        for( String str : strs) {
	        	result += str;
	        }
	        return result;
	    }
	 
	 public static void main(String[] args) {
		 System.out.println(largestNumber(new int[] {3,33,31,32,30,34,5,9}));;
	}
}
