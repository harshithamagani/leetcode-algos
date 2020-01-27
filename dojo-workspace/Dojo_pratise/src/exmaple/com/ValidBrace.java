package exmaple.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidBrace {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		Map<Character, Character> map = new HashMap<>();
		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');
		if(s.length() != 0) {
			if('}' ==  s.charAt(0) || ')' == s.charAt(0) || ']' == s.charAt(0)) {
				return false;
			}
		}
		for(int i=0;i<s.length();i++) {
			Character check =  s.charAt(i);
			if('{' == check || '[' == check || '(' == check) {
				stack.add(check);
			}
			else {
				if(stack.isEmpty() && check !=null) {
					return false;
				}
				else if(map.get(check) == stack.peek()) {
					stack.pop();
				}
				else {
					return false;
				}
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
    }
	public static void main(String[] args) {
		String test = "[])";
		ValidBrace obj = new ValidBrace();
		System.out.println(obj.isValid(test));
	}
}
