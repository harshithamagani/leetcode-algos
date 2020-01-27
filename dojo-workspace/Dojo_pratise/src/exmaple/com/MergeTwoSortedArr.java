package exmaple.com;

import java.util.Arrays;

public class MergeTwoSortedArr {
	
	public int[] mergeArrays(int[] arr1, int[] arr2) 
    { 
		int l1= arr1.length;
		int l2= arr2.length;
		int [] arr = new int[l1+l2];
		int i=0, j=0, k=0;
		while(i < l1 && j < l2) {
			if(arr1[i] < arr2[j]) {
				arr[k++] = arr1[i++];
			}
			else {
				arr[k++] = arr2[j++];
			}
		}
		while(i<l1 && k<arr.length) {
			arr[k++] = arr1[i++];
		}
		while(j<l2 && k<arr.length) {
			arr[k++] = arr2[j++];
		}
		return arr; // make a new resultant array and return your results in that
    } 
	
	public static void main(String[] args) {
		int []arr1 = {1, 3, 4, 5};  
		int []arr2 = {2, 6, 7, 8};
		int [] result;
		MergeTwoSortedArr obj = new MergeTwoSortedArr();
		result = obj.mergeArrays(arr1, arr2);
		System.out.println(Arrays.toString(result));
	}
}
