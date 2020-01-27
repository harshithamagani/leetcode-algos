package exmaple.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AlgoExpertArrSumm {
	public static int[] twoNumberSumAdv(int[] array, int targetSum) {
	    int[] newArr;
	    Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
			for(int i=0;i<array.length;i++){
				Integer y = targetSum-(array[i]);
				if(!map.containsKey(array[i])) {
					map.put(y, true);
				}
				else {
					return new int[] {y,array[i]};
				}
			}
			newArr= new int[0];
			return newArr;
		}
	public static int[] twoNumberSumBasic(int[] array, int targetSum) {
	    int[] newArr;
			for(int i=0;i<array.length;i++){
				for(int j=i+1;j<array.length;j++){
					if(array[i]+array[j] == targetSum){
						newArr= new int[2];
						newArr[0]=array[i];
						newArr[1]=array[j];
						return newArr;
					}
				}
			}
			newArr= new int[0];
			return newArr;
		}
	public static void main(String[] args) {
		int [] arr ={3, 5, -4, 8, 11, 1, -1, 6};
		int target=15;
		int[] result = twoNumberSumAdv(new int[]{-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 163);
		System.out.println(Arrays.toString(result));
	}
}

