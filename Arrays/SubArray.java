import java.util.*;
class SubArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int result=goodSubarrays(arr,k);
		System.out.println("result"+result);
	}
	public static int goodArray(int[] arr,int k)
	{
		int n=arr.length;
		int left=0;
		int count=0;
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
			while(hm.size()>k)
			{
				hm.put(arr[left],hm.get(arr[left])-1);
				if(hm.get(arr[left])==0)
				{
					hm.remove(arr[left]);
				}
				left++;
			}
			count+=(i-left+1);
		}
		return count;
	}
	public static int goodSubarrays(int[] arr,int k)
	{
		return goodArray(arr,k)-goodArray(arr,k-1);
	}
}