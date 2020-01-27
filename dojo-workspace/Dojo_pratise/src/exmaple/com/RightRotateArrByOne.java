package exmaple.com;

import java.util.Arrays;

public class RightRotateArrByOne {
	//more efficient solution without swap
	public static void rotateArrayWithoutSwap(int[] arr) {
		if(arr.length>2) {
		int lastNum =  arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0]=lastNum;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rotateArray(int[] arr) {
		int j = 0;
		for(int i=1;i<arr.length;i++) {
			if(i+1<arr.length) {
				swap(arr,i,j);
			}
		}
		swap(arr,arr.length-1,j);	
	}
	
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		rotateArrayWithoutSwap(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp =  arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
