package algo.leet.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeaneringGivenArray {
	public static List<Integer> meanderingArray(List<Integer> unsorted){
		Collections.sort(unsorted);
		System.out.println(unsorted);
		int start = 0;
		int end = unsorted.size()-1;
		List<Integer> result =  new ArrayList<Integer>();
		if(unsorted.size() % 2 != 0) {
			while(start < end) {
				result.add(unsorted.get(end));
				end--;
				result.add(unsorted.get(start));
				start++;
			}
			result.add(unsorted.get(start));
		}
		else {
			while(start < end) {
				result.add(unsorted.get(end));
				end--;
				result.add(unsorted.get(start));
				start++;
			}
		}
		System.out.println(result);
		return unsorted;
	}
	public static void main(String[] args) {
		Integer [] arr = {-1,1,2,3,-5};
		List<Integer> list = new ArrayList<Integer>(); 
		  
        // Add the array to list 
        Collections.addAll(list, arr);
		meanderingArray(list);
	}
}
