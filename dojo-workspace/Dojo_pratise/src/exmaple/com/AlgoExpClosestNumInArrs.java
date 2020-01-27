package exmaple.com;

import java.util.Arrays;

public class AlgoExpClosestNumInArrs {
	public static int[] smallestDifferenceAdv(int[] arrayOne, int[] arrayTwo) {
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int i=0;
		int j=0;
		int [] newArr = new int[2];
		int smallestDiff = Integer.MAX_VALUE;
		int cs = Integer.MAX_VALUE;
		while(i<arrayOne.length && j<arrayTwo.length) {
			int firstNum = arrayOne[i];
			int secNum = arrayTwo[j];
			if(secNum > firstNum) {
				cs = secNum -firstNum;
				i++;
			}
			else if(secNum < firstNum) {
				cs = firstNum - secNum;
				j++;
			}
			else{
				newArr[0] = firstNum;
				newArr[1] = secNum;
				return newArr;
			}
			if(smallestDiff > cs) {
				smallestDiff = cs;
				newArr[0] = firstNum;
				newArr[1] = secNum;	
			}
		}
		return newArr;
	}
	  public static int[] smallestDifferenceBasic(int[] arrayOne, int[] arrayTwo) {
		int [] newArr = new int [2];
		int smallestDiff = Integer.MAX_VALUE;
		for(int i=0;i<arrayOne.length;i++) {
			for(int j=0;j<arrayTwo.length;j++) {
				int firstNum = arrayOne[i];
				int secNum = arrayTwo[j];
				int cs;
				if(firstNum > secNum) {
					cs = firstNum - secNum;
				}
				else if(firstNum == secNum) {
					newArr[0] = arrayOne[i];
					newArr[1] = arrayTwo[j];
					return newArr;
				}
				else {
					cs = secNum - firstNum;
				}
				if(smallestDiff > cs) {
					smallestDiff = cs;
					newArr[0] = arrayOne[i];
					newArr[1] = arrayTwo[j];
				}
				
			}
		}
		return newArr;
	  }
	  public static void main(String[] args) {
		  int [] arr1 = {-1,5,10,20,28,3};
		  int [] arr2 = {26,134,135,15,17};
		  int [] result = smallestDifferenceAdv(arr1,arr2);
		  System.out.println(Arrays.toString(result));
	}
}
