package exmaple.com;

import java.util.Arrays;

public class findSecMaxNumInArr {
	public static int findSecMaximum(int[] arr) {
		int max = arr[0];
		int secMax = 0;
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("ji");
			if(secMax < arr[i] && arr[i] != max) {
				secMax = arr[i];
			}
		}
		return secMax;
	}
	
	//Time Complexity O(nlogn)
	public static int findSecondMaximum(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		if(arr.length > 2) {
			return arr[arr.length-2];
		}
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		int [] arr = {9, 2, 3, 2, 6, 6};
		System.out.println(findSecMaximum(arr));
	}
}
