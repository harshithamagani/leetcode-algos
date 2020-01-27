package example.com.string.mani.question;

import java.util.Arrays;

public class CheckIfStrsAnagrams {
	// solution 1
	public static boolean checkIfStrsTwoStrsAnagrams1(String s1,String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		String check1=s1.replace(" ", "").toLowerCase();
		String check2=s2.replace(" ", "").toLowerCase();
		
		char [] a = check1.toCharArray();
		char [] b = check2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a, b)) {
			return true;
		}
		return false;
	}
	
	public static boolean checkIfStrsTwoStrsAnagrams2(String s1,String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		String check1=s1.toLowerCase();
		String check2=s2.toLowerCase();
		boolean found =false;
		for(int i=0;i<check1.length();i++) {
			for(int j=0;j<check2.length();j++) {
				Character checkChar = check1.charAt(i);
				if(checkChar == check2.charAt(j)) {
					found = true;	
				}
			}
			if(!found) {
				return false;
			}
			else {
				found =false;
			}
		}
		return true;

	}
	public static void main(String[] args) {
		System.out.println(checkIfStrsTwoStrsAnagrams2("Mary","Army"));
	}
}
