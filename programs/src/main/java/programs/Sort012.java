package programs;

import java.util.Arrays;

public class Sort012 {
	public static void main(String args[]) {
		int arr[]= {1,1,0,2,0,0,1,1,2,2,0,0};
		sort012(arr);
		System.out.println(Arrays.toString(arr));
		}
	 public static void sort012(int arr[]) {
		 int low=0;
		 int high=arr.length-1;
		 int mid=0;
		 while(mid<=high) {
			 switch(arr[mid]) {
			 case 0:{
				 int temp=arr[low];
				 arr[low]=arr[mid];
				 arr[mid]=temp;
				 mid++;
				 low++;
				 break;
			 }
			 case 1:
				 mid++;
				 break;
			 case 2:{
				 int temp=arr[high];
				 arr[high]=arr[mid];
				 arr[mid]=temp;
				 high--;
				 break;
			 }
			 
			 }			 
		 }
	 }
	
}