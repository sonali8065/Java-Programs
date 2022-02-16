package leetcode;
import java.util.*;
public class IntersectArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(intersect(new int[] {1,2,2,1},new int[] {2,2})));
		System.out.println(Arrays.toString(intersect2(new int[] {1,2,3,1},new int[] {2,3,1})));
	}
	 public static int[] intersect(int[] nums1, int[] nums2) {
	       List<Integer> list= new ArrayList<>();
	        Arrays.sort(nums1); Arrays.sort(nums2);
	        int i=0,j=0;
	        while(i<nums1.length && j<nums2.length){
	            if(nums1[i]==nums2[j]){
	                list.add(nums1[i]);
	                i++;
	                j++;
	            }
	            else if(nums1[i]>nums2[j]){
	                j++;
	            }
	            else
	                i++;
	                    
	        }       
	       int arr[]= new int[list.size()];
	       for(int k=0;k<arr.length;k++){
	           arr[k]=list.get(k);
	       }
	        return arr;
	    }
	 public static int[] intersect2(int[] nums1, int[] nums2) {
	       List<Integer> list= new ArrayList<>();
	        HashMap<Integer,Integer> map= new HashMap<>();
	        for(int i=0;i<nums1.length;i++){
	            if(map.containsKey(nums1[i])){
	                map.put(nums1[i],map.get(nums1[i])+1);
	            }else
	               map.put(nums1[i],1);
	        }
	        for(int i=0;i<nums2.length;i++){
	            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
	                list.add(nums2[i]);
	                map.put(nums2[i],map.get(nums2[i])-1);
	            }
	        }
	        
	        
	       int arr[]= new int[list.size()];
	       for(int k=0;k<arr.length;k++){
	           arr[k]=list.get(k);
	       }
	        return arr;
	    }
}
