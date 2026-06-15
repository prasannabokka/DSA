import java.util.*;
class PartitionArray
{
	public static int[] partition(int[] nums,int pivot)
	{
		int n=nums.length;
		List<Integer> less=new ArrayList<>();
		List<Integer> equal=new ArrayList<>();
		List<Integer> greater=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			if(nums[i]<pivot)
			{
				less.add(nums[i]);
			}
			else if(nums[i]==pivot)
			{
				equal.add(nums[i]);
			}
			else
			greater.add(nums[i]);	
		}
		int[] ans=new int[nums.length];
		int k=0;
		for(int num:less)
		{
			ans[k++]=num;
		}
		for(int num:equal)
		{
			ans[k++]=num;
		}
		for(int num:greater)
		{
			ans[k++]=num;
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
		System.out.println("enter pivot");
		int pivot=sc.nextInt();
		int[] result=partition(nums,pivot);
		System.out.println("array "+Arrays.toString(result));
	}
}