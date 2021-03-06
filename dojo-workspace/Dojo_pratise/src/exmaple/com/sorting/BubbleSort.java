package exmaple.com.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void sort(int[] arr){
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-(i+1);j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		int [] arr = {6,4,5,9,6,7,8,3,2};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
