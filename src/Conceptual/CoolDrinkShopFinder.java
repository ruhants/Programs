package Conceptual;

import java.util.Arrays;

public class CoolDrinkShopFinder  {



	public static int[] findTotalShops(int shops,int[]prices,int days,int[] money)
    {
        int [] totalShops=new int[days];
      Arrays.sort(prices);
      for(int i=0;i<days;i++)
      {
          if(money[i]<prices[0])
              totalShops[i] = 0;
          else if(money[i]>=prices[shops-1])
              totalShops[i]=shops;
          else
          totalShops[i]=binarySearch(prices,0,shops-1,money[i]);
      }
      return totalShops;
    }
    public static int binarySearch(int []arr,int low,int high,int money)
    {
       if(arr[low]==money)
           return low+1;
       if(arr[high]<=money)
           return high+1;
       int mid=low+(high-low)/2;
       int maxShops=-1;
       while(arr[mid]==money)
       {
           maxShops=mid;
           mid++;
       }
       if(maxShops!=-1)
           return maxShops+1;
       if(arr[mid]>money)
           return binarySearch(arr,low,mid-1,money);
       else
           return binarySearch(arr,mid+1,high,money);
    }

	    public static void main(String[] args) {
	        // Example usage
	        int shops = 5; // Number of different shops
	        int[] prices = {3,10,8,6,11}; // Rates of cola cola bottles in each shop

	        int days = 4; // Number of days Kenny wants to buy cola cola
	        int[] dailyBudgets = {1,10,3,11} ; // Kenny's daily budget for each day
	        
	        int[] shopsBoughtFromEachDay = findTotalShops(shops, prices, days, dailyBudgets);
	       
	        // Displaying the result for each day
	        for (int i = 0; i < days; i++) {
	            System.out.println("Day " + (i + 1) + ": Kenny can buy colA " + shopsBoughtFromEachDay[i] + " shops.");
	        }
	    }
}
