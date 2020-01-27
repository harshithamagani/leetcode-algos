package algo.leet.code;

import java.util.HashMap;
import java.util.HashSet;

public class Isomorfic {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int i=0;
        HashMap<Character, Character> map = new HashMap<>();
        while(i<s.length()) {
        	if(!map.containsKey(s.charAt(i))) {
        		map.put(s.charAt(i), t.charAt(i));
        		i++;
        	} else {
        		Character c = map.get(s.charAt(i));
        		if(c.equals(new Character(t.charAt(i)))) {
        			i++;
        		} else {
        			return false;
        		}
        	}
        }
        HashSet<Character> set = new HashSet<Character>(map.values());
        if(map.size() != set.size()) {
        	return false;
        }
        
        return true;
    }
    public static void main(String[] args) {
		String s="aa"; String t="ab";
		Isomorfic i =new Isomorfic();
		System.out.println(i.isIsomorphic(s, t));
	}
}
