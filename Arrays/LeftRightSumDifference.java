import java.util.*;
class LeftRightSumDifference
{
	public static int[] sumdifference(int[] nums)
	{
		int n=nums.length;
		int[] leftsum=new int[n];
		int[] rightsum=new int[n];
		int[] ans=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			leftsum[i]=sum;
			sum+=nums[i];
		}
		sum=0;
		for(int i=n-1;i>=0;i--)
		{
			rightsum[i]=sum;
			sum+=nums[i];
		}
		for(int i=0;i<n;i++)
		{
			ans[i]=Math.abs(leftsum[i]-rightsum[i]);
		}
		return ans;
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
		int[] result=sumdifference(nums);
		System.out.println("difference"+Arrays.toString(result));
	}
}