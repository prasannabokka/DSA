import java.util.*;
class SortedArray {
    	public static int search(int[] nums, int target) {
		int low=0, high=nums.length-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(nums[mid]==target)
			{
				return mid;
			}
			if(nums[low]<=nums[mid])
			{
				if(target>=nums[low] && target<nums[mid])
				{
				     high=mid-1;
				}
				else
				{
					low=mid+1;
				}
			}
			else
			{
				if(target>nums[mid] && target<=nums[high])
				{
				     low=mid+1;
				}
				else
				{
				 	high=mid-1;
				}
			}
		}
		return -1;
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
		System.out.println("enter target");
		int target=sc.nextInt();	
		int result=search(nums,target);
		System.out.println("target at index "+result);
	}
}