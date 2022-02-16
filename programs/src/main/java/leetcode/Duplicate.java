package leetcode;

import java.util.HashSet;

public class Duplicate {

	public static void main(String[] args) {
		System.out.println(containDuplicate(new int[]{1,6,3,7,4}));
	}
	public static boolean containDuplicate(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int num:arr) {
			if(set.contains(num)) {
				return true;
			}
			else {
				set.add(num);
			}			
		}
		return false;
	}

}
