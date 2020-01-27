package algo.leet.code;

import java.util.Arrays;

//The number of elements initialized in nums1 and nums2 are m and n respectively.
//You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.

public class MergeTwoArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] dummy = new int [m];
        for(int i=0;i<m;i++) {
        	dummy[i]=nums1[i];
        }
        int i=0;     // i->nums1
        int j=0;	 // j->nums2
        int k=0;     // k->dummy
        while(k<dummy.length && j<nums2.length && i<nums1.length) {
        	if(dummy[k] > nums2[j]) {
        		nums1[i++]=nums2[j++];	
        	}
        	else {
        		nums1[i++]=dummy[k++];
        	}
        }
        if(k<dummy.length) {
        	while(k<dummy.length) {
        		nums1[i++]=dummy[k++];
        	}
        }
        if(j<nums2.length) {
        	while(j<nums2.length) {
        		nums1[i++]=nums2[j++];
        	}
        }
    }
	public static void main(String[] args) {
		int [] nums1= {1,2,3,0,0,0}; int m = 3;
		int [] nums2 = {2,5,6}; int n = 3;
		merge(nums1,m, nums2,n);
		System.out.println(Arrays.toString(nums1));
	}
}
