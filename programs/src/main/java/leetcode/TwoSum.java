package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= twoSum(new int[]{2,1,0,6,9},7);
		int arr1[]= twoSum1(new int[]{3,1,2,6,9},5);
		
		Arrays.stream(arr).forEach(System.out::println);
		Arrays.stream(arr1).forEach(System.out::println);
	}

	 private static int[] twoSum1(int[] nums, int target) {
		
		 HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		 for(int i=0;i<nums.length;i++) {
			 int rem=target-nums[i];
			 if(map.containsKey(rem))
				 return new int[] {map.get(rem),i};
			 else
				 map.put(nums[i], i);
		 }
		 throw new IllegalArgumentException("no match found");
	}

	public static int[] twoSum(int[] nums, int target) {
	        int i=0;
	        int j=nums.length -1;
	        int cnums[]=Arrays.copyOf(nums,nums.length);
	        Arrays.sort(cnums);
	        int arr[] = new int[2];
	        while(i<j){
	            if(cnums[i]+cnums[j]==target){
	                arr[0]=i;
	                arr[1]=j;
	                break;
	            }
	            else if(cnums[i]+cnums[j]>target){
	                j--;
	            }
	            else
	                i++;
	            
	        }
	        for(int k=0;k<nums.length;k++){
	            if(cnums[arr[0]]==nums[k]){
	                arr[0]=k;
	                break;
	            }
	        }
	        for(int k=nums.length-1;k>=0;k--){
	         if(cnums[arr[1]]==nums[k]){
	                arr[1]=k;
	             break;
	         }
	        }
	        return arr;
	    }
}
