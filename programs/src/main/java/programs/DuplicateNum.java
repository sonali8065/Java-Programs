package programs;

import java.util.*;
import java.util.Map.Entry;

public class DuplicateNum {
	public static void main(String args[]) {
	int arr[]= {2,5,9,6,9,3,8,9,7,1};
	System.out.println(findDuplicate4(arr));
	}
	
	public static int findDuplicate1(int arr[]) {
		Arrays.sort(arr);//O(nlogn)
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				return arr[i];
			}
		}	
		return -1;
	}
	
	public static int findDuplicate2(int arr[]) {
		Set<Integer> set=new HashSet<Integer>();	//TC=O(n),SC=O(n)
		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i])) {
				return arr[i];
			}
			else {
				set.add(arr[i]);
			}
		}		
		return-1;
	}
	
	public static int findDuplicate3(int arr[]) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();	
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}	
		for(Entry<Integer,Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				return entry.getKey();
			}
		}
		return-1;
	}
	
	public static int findDuplicate4(int arr[]) {
		int slow=arr[0];//O(n)
		int fast=arr[0];
		do {
			slow=arr[slow];
			fast=arr[arr[fast]];
		}while(slow!=fast);
		fast=arr[0];
		while(slow!=fast) {
			slow=arr[slow];
			fast=arr[fast];
		}
		return slow;	
	}
	
	
}
