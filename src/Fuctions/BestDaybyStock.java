package Fuctions;

public class BestDaybyStock {
	public static int maxProfit(int[] prices) {
	    int buyprice = prices[0];
	    int op = 0;// overall profit
	    int pist = 0; // profit if sold today
	    for(int i = 0; i < prices.length; i++){
	        if(prices[i] < buyprice){
	            buyprice = prices[i];
	        }
	        pist = prices[i] - buyprice;
	        //System.out.println(pist);
	        if(op < pist){
	            op = pist;
	        }
	    }
	    return op;
	}
	
	public static void main(String[] args) {
		  int[] prices = {32,31,25,1,50};//,2,1,8,10,7};
		  int maxProfit = maxProfit(prices);
		  System.out.println("Maximum Profit: " + maxProfit);
	}
}