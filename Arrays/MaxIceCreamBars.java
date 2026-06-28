import java.util.*;
class MaxIceCreamBars
{
	public static int maxBars(int[] costs,int coins)
	{
		Arrays.sort(costs);
		int count=0;
		int sum=0;
		for(int i=0;i<costs.length;i++)
		{
			if(sum+costs[i]<=coins)
			{
				sum+=costs[i];
				count++;
			}
			else
			{
				break;
			}
		}
		return count;
	}
	public static void main(String args[])	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of costs");
		int n=sc.nextInt();
		System.out.println("enter costs");
		int[] costs=new int[n];
		for(int i=0;i<n;i++)
		{
			costs[i]=sc.nextInt();
		}
		System.out.println("enter no of coins");
		int coins=sc.nextInt();
		int result=maxBars(costs,coins);
		System.out.println("Max no of Bars "+result);
	}
}