import java.util.*;
public class SubArrayProduct
{
	public static int product(int[] nums,int k)
	{
		if(k<=1) return 0;
		int count=0;
		int left=0;
		int product=1;
		for(int right=0;right<nums.length;right++)
		{
			product*=nums[right];
			while(product>=k)
			{
				product/=nums[left];
				left++;
			}
			count+=right-left+1;
		}
		return count;
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
		System.out.println("enter k value");
		int k=sc.nextInt();
		int result=product(nums,k);
		System.out.println("subArrays "+result);
	}
}