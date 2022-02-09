package basicStringPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		System.out.println(getNonRepeatChar("analogy"));
		System.out.println(getNonRepeatChar1("easiest"));
		
	}

	private static Character getNonRepeatChar1(String str) {
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character ch:str.toCharArray()) {
			if(map.containsKey(ch)) 
				map.put(ch, map.get(ch)+1);	
			else
				map.put(ch, 1);
		}
		for(Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()==1)
				return entry.getKey();
		}
		
		return null;
	}

	private static Character getNonRepeatChar(String str) {
		for(char ch:str.toCharArray()) {
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				return ch;
			}
		}
		return null;
	}
}
