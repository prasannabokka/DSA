import java.util.*;
class MaxEleAfterDecAndRearrange
{
	public static int maxElement(int[] arr)
	{
		Arrays.sort(arr);
		int prev=1;
		for(int i=0;i<arr.length;i++)
		{
			prev = Math.min(arr[i], prev + 1);
		}
		return prev;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);			
		System.out.println("enter no of elements");
		int n=sc.nextInt();
		System.out.println("enter elements");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int result = maxElement(arr);
		System.out.println("Max Element "+result);
	}
}