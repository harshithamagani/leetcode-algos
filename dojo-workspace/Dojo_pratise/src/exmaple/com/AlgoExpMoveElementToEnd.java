package exmaple.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgoExpMoveElementToEnd {
	public static List<Integer> moveElementToEndAdv(List<Integer> array, int toMove) {
		int i=0;
		int j=array.size()-1;
		while(i<array.size() && j>i) {
			if(array.get(i) == toMove && array.get(j) != toMove) {
				int temp = array.get(i);
				array.set(i, array.get(j));
				array.set(j, temp);
			}
			else if(array.get(i) != toMove) {
				i++;
			}
			else if(array.get(j) == toMove) {
				j--;
			}
		}
		return array;
	}
	
	//O(n) time and O(n) space
	 public static List<Integer> moveElementToEndBasic(List<Integer> array, int toMove) {
		    // Write your code here.
		    List<Integer> newArr = new ArrayList<Integer>();
		    
		    for(Integer num : array) {
		    	if(num != toMove) {
		    		newArr.add(num);
		    		}	
		    }
		    for(Integer num : array) {
		    	if(num == toMove) {
		    		newArr.add(num);
		    		}	
		    }
		 	return newArr;
		  }
	 public static void main(String[] args) {
		Integer [] arr = {1,2,4,5,3};
		List<Integer> array = Arrays.asList(arr);
		int toMove = 3;
		array = moveElementToEndAdv(array,toMove);
		System.out.println(array.toString());
	}
}
