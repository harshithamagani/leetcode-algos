package exmaple.com;


public class MinValueInArr {
	
	public static int findMinimum(int[] arr) {
		int min = arr[0];
		int i=1;
		int j=arr.length-1;
		while(i<j+1 && j>0) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[j]<min) {
				min=arr[j];
			}
			i++;
			j--;
		}
		return min;
	}

	public static void main(String[] args) {
		int [] arr = {9, 2, 3, 6};
		int min = findMinimum(arr);
		System.out.println(min);
	}
}
