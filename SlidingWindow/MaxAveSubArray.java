import java.util.*;
public class MaxAveSubArray
{
	public static double maxAvgSubArray(int[] nums,int k)
	{
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum+=nums[i];
		}
		int maxSum=sum;
		for(int i=k;i<nums.length;i++)
		{
			sum=sum-nums[i-k]+nums[i];
			maxSum=Math.max(maxSum,sum);
		}
		return (double)maxSum/k;
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
		System.out.println("enter window size");
		int k=sc.nextInt();
		double result=maxAvgSubArray(nums,k);
		System.out.println("Max sum "+result);
	}
}