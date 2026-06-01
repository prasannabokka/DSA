import java.util.*;
class MedianOfTwoArrays
{
	public static double median(int[] num1,int[] num2)
	{
		int m=num1.length;
		int n=num2.length;
		int merge[]=new int[m+n];
		int i=0,j=0,k=0;
		while(i<m && j<n)
		{
			if(num1[i]<=num2[j])
			{
				merge[k++]=num1[i++];
			}
			else
			{
				merge[k++]=num2[j++];
			}
		}
		while(i<m)
		{
			merge[k++]=num1[i++];
		}
		while(j<n)
		{
			merge[k++]=num2[j++];
		}
		int total=m+n;
		if(total%2==1)
		{
			return merge[total/2];
		}
		return (merge[total/2]+merge[total/2-1])/2.0;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of first array elements");
		int m=sc.nextInt();
		System.out.println("enter elements");
		int[] num1=new int[m];
		for(int i=0;i<m;i++)
		{
			num1[i]=sc.nextInt();
		}
		System.out.println("enter no of second Array elements");
		int n=sc.nextInt();
		System.out.println("enter elements");
		int[] num2=new int[n];
		for(int i=0;i<n;i++)
		{
			num2[i]=sc.nextInt();
		}
		double result=median(num1,num2);
		System.out.println("median "+result);
	}
}
