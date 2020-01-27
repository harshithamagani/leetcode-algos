package algo.leet.code;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	    public static int majorityElement(int[] nums) {
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        int maxOccur=0;
	        int ans = nums[0];
	        for(int i=0;i<nums.length;i++){
	            if(!map.containsKey(nums[i])){
	                map.put(nums[i],1);
	            }
	            else{
	                int count = map.get(nums[i]);
	                count += 1;
	                map.put(nums[i], count);
	                if(maxOccur < count) {
	                	maxOccur = count;
	                	ans = nums[i];
	                }
	            }
	        }
	        return ans;
	    }
	    public static void main(String[] args) {
	    	int result = majorityElement(new int[] {1,2,1,1,1,2,2,2,2});
	    	System.out.println(result);
		}
}
