package algo.leet.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
	 public static boolean wordPattern(String pattern, String str) {
		 String [] arr = str.split(" ");
		 System.out.println(Arrays.toString(arr));
		 HashMap<Character,String> map = new HashMap<>();
		 if(pattern.length() != arr.length) {
			 return false;
		 }
		 int i=0;
		 while(i<pattern.length()) {
			 if(map.containsKey(pattern.charAt(i))) {
				 String check = map.get(pattern.charAt(i));
				 if(check.equals(arr[i])) {
					 i++;
				 }
				 else {
					 return false;
				 }
			 }else {
				 map.put(pattern.charAt(i), arr[i]);
				 i++;
			 }
			 
		 }
		 HashSet<String> set = new HashSet<String>(map.values());
		 if(set.size() != map.size()) {
			 return false;
		 }
	     return true;
	    }
	 public static void main(String[] args) {
		 wordPattern("abba","dog cat cat dog");
		 
		 
	}
}
