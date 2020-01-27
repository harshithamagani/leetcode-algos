package algo.leet.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicateAndCount {
	 public static int removeDuplicates(int[] nums) {
	        int i=0;
	        int j=nums.length-1;
	        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
	        while(j>i) {
	        	if(map.containsKey(nums[i])) {
	        		if(nums[i] == nums[j]) {
	        			i--;
	        			j--;
	        		}
	        		else if(nums[i] != nums[j]){
	        			if(!map.containsKey(nums[j])) {
	        				int temp = nums[i];
		        			nums[i] = nums[j];
		        			nums[j] = temp;
		        			i--;
		        			j--;
	        			}
	        			else {
	        				i--;
	        				j--;
	        			}
	        		}
	        	} else {
	        		map.put(nums[i], true);
	        	}
	        	i++;
	        }
	        System.out.println(Arrays.toString(nums));
	        return nums.length-j;
	    }
	 public static void main(String[] args) {
		 System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
		 //System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));;
	}
}
