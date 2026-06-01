import java.util.*;
class Buy_candies_with_discount
{
	public static int totalcost(int[] cost)
	{
		Arrays.sort(cost);
		int total=0;
		int count=0;
		for(int i=cost.length-1;i>=0;i--)
		{
			count++;
			if(count%3==0)
			{
				continue;
			}		
			total+=cost[i];
		}
		return total;		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of candies");
		int n=sc.nextInt();
		System.out.println("enter cost");
		int[] cost=new int[n];
		for(int i=0;i<n;i++)
		{
			cost[i]=sc.nextInt();
		}
		int result=totalcost(cost);
		System.out.println("Totalcost "+result);
	}
}