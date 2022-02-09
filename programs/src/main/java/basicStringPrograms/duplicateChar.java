package basicStringPrograms;

import java.util.HashMap;

public class duplicateChar {

	public static void main(String[] args) {
		String str="google";
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(char c:str.toCharArray()) {
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c,1);					
		}
		for(Character c:map.keySet()) {
			if(map.get(c)>1) {
				System.out.println(c+"--"+map.get(c));
			}
		}
		
	}
	

}
