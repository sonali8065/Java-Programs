package leetcode;

public class MaximumSubarray {

	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] {-2,4,1,18,-5,21,2,-1,6}));
	}

	 public static int maxSubArray(int[] arr) {
		 int curr=0,max=arr[0];
		 for(int i=0;i<arr.length;i++) {
			 curr=Math.max(curr,arr[i]);
			 max=Math.max(max, curr);
		 }
		return max; 
	 }

}
