package exmaple.com;

import java.util.Arrays;
public class ReArrangeNegNPosNum {
	
	public static int[] reArrange1(int[] arr) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				if(i != j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			} 
		}
		return arr;
	}
	
	public static int[] reArrange(int[] arr) {
		int [] newArr = new int[arr.length];
		int i=0;
		int j=0;
		while(i<arr.length && j<newArr.length) {
			if(arr[i]<0) {
				newArr[j++]=arr[i];
			}
			i++;
		}
		i=0;
		while(i<arr.length && j<newArr.length) {
			if(arr[i]>0) {
				newArr[j++]=arr[i];
			}
			i++;
		}
		return newArr;
	}
	public static void main(String[] args) {
		int [] arr = {10, -1, 20, 4, 5, -9, -6};
		arr = reArrange1(arr);
		System.out.println(Arrays.toString(arr));
	}
}
