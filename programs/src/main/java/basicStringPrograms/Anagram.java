package basicStringPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String word1="night";
		String word2="thing";
		
		System.out.println(isAnagram(word1,word2));
		System.out.println(isAnagram2(word1,word2));
		System.out.println(isAnagram3(word1,word2));

	}

	private static boolean isAnagram3(String word1, String word2) {
		if(word1.length()!=word2.length())
			return false;
		
		int count[] = new int[256];
		for(int i=0;i<word1.length();i++) {
			count[word1.charAt(i)]++;
			count[word2.charAt(i)]--;
		}
		for(int i=0;i<256;i++) {
			if(count[i]!=0)
				return false;
		}
		return true;
	}

	private static boolean isAnagram2(String word1, String word2) {
		char[] arr1=word1.toCharArray();
		char[] arr2= word2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return String.valueOf(arr1).equals(String.valueOf(arr2));
	}

	private static boolean isAnagram(String word1, String word2) {
		if(word1.length()!=word2.length())
		return false;
		
		for(int i=0;i<word1.length();i++) {
			char ch=word1.charAt(i);
			int index=word2.indexOf(ch);
			
			if(index!=-1)
				word2=word2.substring(0,index)+word2.substring(index+1);
			else
				return false;
			
		}
		return word2.isEmpty();
	}

}
