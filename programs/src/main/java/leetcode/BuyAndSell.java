package leetcode;

public class BuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
	}
	 public static int maxProfit(int[] prices) {
	       if (prices.length == 0) {
				 return 0 ;
			 }
	       int min=prices[0];int max=0;
	       for(int i=0;i<prices.length;i++) {
	    	  if(prices[i]>min) {
	    		  max= Math.max(max,prices[i]-min);
	    	  }
	    	  else
	    		  min=prices[i];
	       }
	       return max;
	       
	 }

}
