package exmaple.com.sorting;

import java.util.Arrays;

public class QuickSort {
	public static void quicksort(int[] array) {
		quicksort(array, 0, array.length-1);
	}
	public static void quicksort(int[] array, int left, int right) {
		if(left >= right) {
			return;
		}
		int pivot = array[(left + right) /2];
		int index = partition(array,left,right,pivot);
		quicksort(array, left, index -1);
		System.out.println(Arrays.toString(array) + "left"+left);
		quicksort(array, index, right);
		System.out.println(Arrays.toString(array) + "right");
	}
	private static int partition(int[] array, int left, int right, int pivot) {
		while(left<=right) {
			while(array[left]<pivot) {
				left++;
			}
			while(array[right]>pivot) {
				right--;
			}
			if(left <= right) {
				swap(array,left,right);
				left++;
				right--;
			}
		}
		System.out.println("left"+left);
		return left;
	}
	private static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
	public static void main(String[] args) {
		int [] arr = {1, 21, 3, 14, 5, 60, 7, 6};
		quicksort(arr);
		//System.out.println(Arrays.toString(arr));
	}
}
