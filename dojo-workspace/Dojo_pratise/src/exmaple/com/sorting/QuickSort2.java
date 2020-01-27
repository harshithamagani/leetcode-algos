package exmaple.com.sorting;

import java.util.Arrays;

public class QuickSort2 {
	public void quickSort(int [] arr) {
		quickSort(arr,0,arr.length-1);
	}
	public void quickSort(int [] arr,int left,int right) {
		if(left >= right) {
			return;
		}
		int pivot = arr[(left+right)/2];
		int index = partition(arr,left,right,pivot);
		quickSort(arr,left,index-1);
		quickSort(arr,index,right);
	}
	private int partition(int[] arr, int left, int right,int pivot) {
		while (arr[left] < pivot) {
			left++;
		}
		while(arr[right] > pivot) {
			right--;
		}
		while(left<=right) {
			swap(arr,left,right);
			left++;
			right--;
		}
		return left;
	}
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		int [] arr = {11,23,13,96,67};
		QuickSort2 s= new QuickSort2();
		s.quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
