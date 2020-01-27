package exmaple.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgoThreeNumSum {
	
	  public static List<Integer[]> threeNumberSumBasic(int[] array, int targetSum) {
		  List<Integer[]> list = new ArrayList<Integer[]>();
		  Arrays.sort(array);
		  for(int i=0;i<array.length;i++) {
			  int left=i+1;
			  int right=array.length-1;
			  while(left<right) {
				  int checkSum = array[i]+array[left]+array[right];
				 if(checkSum == targetSum) {
					 Integer[] newArr = new Integer[3];
					 newArr[0]=array[i];
					 newArr[1]=array[left];
					 newArr[2]=array[right];
					 list.add(newArr);
					 left++;
					 right--;
				 }
				 else if(checkSum > targetSum) {
					 right--;
				 }
				 else if(checkSum < targetSum) {
					 left++;
				 }
				 
			  }
			  
		  }
		  return list;
		  }
	  public static void main(String[] args) {
		  List<Integer[]> list = threeNumberSumBasic(new int[]  {1, 2, 3}, 6);
		  for(Integer [] arr : list) {
			  System.out.println(Arrays.toString(arr));
		  }
	}
}
