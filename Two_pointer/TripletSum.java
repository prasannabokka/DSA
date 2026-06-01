import java.util.*;
class TripletSum
{
	public static List<List<Integer>> threesum(int[] num)
	{
		List<List<Integer>> result=new ArrayList<>();
		Arrays.sort(num);
		for(int i=0;i<num.length-2;i++)
		{
			if(i>0 && num[i]==num[i-1])
			continue;
			int left=i+1;
			int right=num.length-1;
			while(left<right)
			{
				int sum=num[i]+num[left]+num[right];
				if(sum==0)
				{
					result.add(Arrays.asList(num[i],num[left],num[right]));			
					while(left<right && num[left]==num[left+1])
					{
						left++;
					}
					while(left<right && num[right]==num[right-1])
					{
						right--;
					}
					left++;
					right--;
				}
				else if(sum<0)
				{
					left++;
				}
				else
				{
					right--;
				}

			}
		}	
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=sc.nextInt();
		System.out.println("enter elements");	
		int[] num=new int[n];
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		List<List<Integer>> result=threesum(num);
		System.out.println("result "+result);
	}
}
		
		
			
