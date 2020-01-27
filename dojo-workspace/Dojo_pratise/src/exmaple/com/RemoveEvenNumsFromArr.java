package exmaple.com;

import java.util.Arrays;

public class RemoveEvenNumsFromArr {
	public int[] removeEvenNums(int [] arr)  {
		int counter =0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]%2 != 0) {
				counter++;
			}
		}
		int [] result = new int[counter];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]%2 != 0) {
				result[j++] = arr[i];
			}
		}
		return result;
	}
	public static void main(String [] args) {
		int[] arr = {1, 2, 4, 5, 10, 6, 3};
		RemoveEvenNumsFromArr obj = new RemoveEvenNumsFromArr();
		arr = obj.removeEvenNums(arr);
		System.out.println(Arrays.toString(arr));
	}
}
