import java.util.*;
class MinSumSqDiff
{
	public static long minSumSqDiff(int[] nums1,int[] nums2,int k1,int k2)
	{
		long k=k1+k2;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<nums1.length;i++)
		{
			int diff = Math.abs(nums1[i]-nums2[i]);
			pq.offer(diff);
		}
		while(k>0 && !pq.isEmpty())
		{
			int maxdiff = pq.poll();
			if(maxdiff==0)
			{
				break;
			}
			maxdiff--;
			pq.offer(maxdiff);
			k--;
		}
		long sum=0;
		while(!pq.isEmpty())
		{
			long diff = pq.poll();
			sum+= diff*diff;
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=sc.nextInt();
		System.out.println("enter 1st array elements");
		int nums1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			nums1[i]=sc.nextInt();
		}
		System.out.println("enter 2nd array elements");
		int nums2[]=new int[n];
		for(int i=0;i<n;i++)
		{
			nums2[i]=sc.nextInt();
		}
		System.out.println("enter k1");
		int k1= sc.nextInt();
		System.out.println("enter k2");
		int k2=sc.nextInt();
		long result = minSumSqDiff(nums1,nums2,k1,k2);
		System.out.println("sum" + result);
	}
}
	