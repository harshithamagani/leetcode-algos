package exmaple.com;


//leetcode problem 14
public class FindCommanPrefix {
	public String longestCommonPrefix(String[] strs) {
		String result= "";
		//loop through the word
		if(strs.length != 0) {
		String word = strs[0]; 
		for(int i=0;i<word.length();i++) {
			char check = word.charAt(i);
			for(int j=1;j<strs.length;j++) {
				if(i+1<=strs[j].length()) {
				if(strs[j].charAt(i)!=check) {
					return result;
				}
				}
				else {
					return result;
				}
			}
			result = result + check;
		}
		}
		return result;
    }
	public static void main(String[] args) {
		String [] arr = {"aa","a"};
		FindCommanPrefix obj = new FindCommanPrefix();
		String commonPrefix = obj.longestCommonPrefix(arr);
		System.out.println(commonPrefix);
	}
}
