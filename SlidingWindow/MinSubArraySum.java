import java.util.*;
public class MinSubArraySum
{
	public static int minSubArrraySum(int[] nums,int target)
	{
		int sum=0;
		int min=Integer.MAX_VALUE;
		int left=0;
		for(int right=0;right<nums.length;right++)
		{
			sum+=nums[right];	
			while(sum>=target)
			{
				min=Math.min(min,right-left+1);
				sum-=nums[left];
				left++;	
			}
		}
		return min==Integer.MAX_VALUE?0:min;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=sc.nextInt();
		System.out.println("enter elements");
		int[] nums=new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		System.out.println("enter target value");
		int target=sc.nextInt();	
		int result=minSubArrraySum(nums,target);
		System.out.println("Min SubArray "+result);
	}
}