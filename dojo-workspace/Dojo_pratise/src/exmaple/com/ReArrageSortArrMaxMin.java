package exmaple.com;

import java.util.Arrays;

public class ReArrageSortArrMaxMin {
	
	public static void maxMin(int[] arr) {
		int [] newArr = new int[arr.length];
		int i=0;
		int j=arr.length-1;
		boolean switchPointer=true;
		
		for(int k=0;k<newArr.length;k++) {
			if(switchPointer) {
				newArr[k]=arr[j--];
			}
			else {
				newArr[k]=arr[i++];
			}
			switchPointer = !switchPointer;
		}
		for(int f=0;f<arr.length;f++) {
			arr[f]=newArr[f];
		}
	}
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		maxMin(arr);
		System.out.println(Arrays.toString(arr));
	}
}
