package algo.leet.code;

import java.util.Arrays;

public class RotatingArray {
	public static void rotate(int[] nums, int k) {
		if(k<=0) {
			return ;
		}
		if(k==nums.length || nums.length==1) {
			return;
		}
		if(k>nums.length) {
			k=k-nums.length;
		}
		int i=nums.length-2;
		int j=nums.length-1;
		int count = 0;
		while(count < k) {
			System.out.println("count"+count);
			System.out.println("k"+k);
			int prev = nums[nums.length-1];
			System.out.println("prev"+prev);
			 while(i>=0) {
					nums[j] = nums[i];
					i--;
					j--;
			}
			System.out.println(Arrays.toString(nums));
			nums[0] = prev;
			i=nums.length-2;
			j=nums.length-1;
			count++;
		}
    }
	public static void main(String[] args) {
		int nums [] = {1,2,3,4}; int k=3;
		rotate(nums,k);
		System.out.println(Arrays.toString(nums));
	}
}
