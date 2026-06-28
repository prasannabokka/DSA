import java.util.*;
class RotatedArray
{
	public static void rotate(int[] nums,int k)
	{
		int n=nums.length;
		k=k%n;
		reverse(nums,0,n-1);
		reverse(nums,0,k-1);
		reverse(nums,k,n-1);
	}
	private static void reverse(int[] nums,int left,int right)
	{
		while(left<right)
		{
			int temp=nums[left];
			nums[left]=nums[right];
			nums[right]=temp;
			left++;
			right--;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=sc.nextInt();
		System.out.println("enter array");
		int[] nums=new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		System.out.println("enter k value");
		int k=sc.nextInt();
		rotate(nums,k);
		System.out.println("rotated array");
		for(int i=0;i<n;i++)
		{
			System.out.println(nums[i]+" ");
		}
	}
}
		
		