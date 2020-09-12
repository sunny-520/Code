package SearchingAlgorithms;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
	
	public static void findFirstNonRep(String s) {
		HashMap<Character, Integer> hMap=new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(hMap.containsKey(c)) {
				hMap.put(c,hMap.get(c)+1);
			}else {
				hMap.put(c,1);
			}
		}
		for(Character c: hMap.keySet()) {
			if(hMap.get(c)==1) {
				System.out.println(c);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		String s="abgadcdafeg";
		FirstNonRepeatingCharacter.findFirstNonRep(s);

	}

}
