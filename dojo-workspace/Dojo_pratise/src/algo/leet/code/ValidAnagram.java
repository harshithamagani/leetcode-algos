package algo.leet.code;

import java.util.Arrays;

public class ValidAnagram {
	 public static boolean isAnagram(String s, String t) {
		char [] sArr = s.toCharArray();
		char [] tArr = t.toCharArray();
		
		Arrays.sort(sArr);
		Arrays.sort(tArr);
		
		String str1 = new String(sArr);
		String str2 = new String(tArr);
		
		if(str1.equals(str2)) {
			return true;
		}
			return false; 
	    }
	 public static void main(String[] args) {
		 String str1 = "anagram";
		 String str2 = "nagaram";
		 
		 System.out.println(isAnagram(str1,str2));
	}
}
