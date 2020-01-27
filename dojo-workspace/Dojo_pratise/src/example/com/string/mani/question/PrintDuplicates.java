package example.com.string.mani.question;

import java.util.HashMap;
import java.util.Map.Entry;

public class PrintDuplicates {
	
	//For example, if String is "Java" then the program should
	//print "a". Bonus points if your program is robust and 
	//handles different kinds of input e.g. String without 
	//duplicate, null or empty String etc. Bonus points if you 
	//also write unit tests for normal and edge cases.
	public static void printDupliCharsIfExsist(String str){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			Character checkChar =  str.charAt(i);
			if(map.containsKey(checkChar)) {
				Integer count = map.get(checkChar)+1;
				map.put(checkChar, count);
			}
			else {
				map.put(checkChar,1);
			}
		}
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}
	 public static void main(String[] args) {
		 printDupliCharsIfExsist("apple");
	}
}
