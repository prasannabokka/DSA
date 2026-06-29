import java.util.*;
class BuySellStock
{
	public static int buyAndSell(int[] prices)
	{
		int minPrice=prices[0];
		int maxProfit=0;
		for(int i=0;i<prices.length;i++)
		{
			minPrice=Math.min(minPrice,prices[i]);
			int profit=prices[i]-minPrice;
			maxProfit=Math.max(maxProfit,profit);
		}
		return maxProfit;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of Elements");
		int n=sc.nextInt();
		System.out.println("enter elements");
		int[] prices=new int[n];
		for(int i=0;i<n;i++)
		{
			prices[i]=sc.nextInt();
		}
		int result=buyAndSell(prices);
		System.out.println("MaxProfit "+result);
	}
}