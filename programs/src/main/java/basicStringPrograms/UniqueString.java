package basicStringPrograms;

import java.util.HashSet;

public class UniqueString {

	public static void main(String[] args) {
		String word="Sonali";
		System.out.println(isUnique(word));
		System.out.println(isUnique1(word));
		System.out.println(isRotation(word,"aliSon"));
	}

	private static boolean isRotation(String word, String rotatedword) {
		String str2=word+word;
		if(str2.contains(rotatedword))
			return true;		
		return false;
	}

	private static boolean isUnique1(String word) {
		for(char c:word.toCharArray()) {
			if(word.indexOf(c)!=word.lastIndexOf(c))
				return false;
		}
		return true;
	}

	private static boolean isUnique(String word) {
		HashSet<Character> set = new HashSet<Character>();
		for(char c:word.toCharArray()) {
			if(!set.add(c))
				return false;
		}		
		return true;
	}
	

	
}
