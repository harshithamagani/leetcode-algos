package algo.leet.code;

import java.util.HashSet;

public class LongestUniqSubStr {
	 public static int lengthOfLongestSubstring(String s) {
	        int i=0;
	        int j=0;
	        int max= 0;
	        HashSet<Character> set = new HashSet<Character>();
	        while(j<s.length()){
	            if(!set.contains(s.charAt(j))){
	                set.add(s.charAt(j));
	                j++;
	                max = Math.max(set.size(),max);
	            }
	            else{
	                set.remove(s.charAt(i));
	                i++;
	            }
	        }
	        return max;
	    }
	 public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
}
