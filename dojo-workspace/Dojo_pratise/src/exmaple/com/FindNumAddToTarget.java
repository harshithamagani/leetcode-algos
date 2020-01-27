package exmaple.com;

import java.util.Arrays;

public class FindNumAddToTarget {
	//brute force way to solve the problem
	 public static int[] findSum(int[] arr, int n) 
	  {
	    int[] result = new int[2];
	    for(int i=0;i<arr.length;i++) {
	    	for(int j=i+1;j<arr.length;j++) {
	    		if(arr[i] + arr[j]==n) {
	    			result[0]=arr[i];
	    			result[1]=arr[j];
	    		}
	    	}
	    }
	    return result;   // return the elements in the array whose sum is equal to the value passed as parameter 
	  }
	 //keeping time complexity in mind
	 //first sort the array and then 
	 public static int[] findSumSort(int[] arr, int n) {
		 int[] result = new int[2]; 
		 Arrays.sort(arr);
		 int i=0;
		 int j=arr.length-1;
		 while(i<arr.length && j>0) {
			 if(arr[j] > n) {
				j--; 
			 }
			 if(arr[i]+arr[j]<n) {
				 i++;
			 }
			 if(arr[i]+arr[j]>n) {
				 j--;
			 }
			 if(arr[i]+arr[j] == n) {
				 result[0]=arr[i];
				 result[1]=arr[j];
				 return result;
			 }
		 }
		 
		 return result; 
	 }
	public static void main(String[] args) {
		int []arr = {1, 21, 3, 14, 5, 60, 7, 6};
		int value = 27;
		System.out.println(Arrays.toString(findSumSort(arr, value)));;
	}
}
