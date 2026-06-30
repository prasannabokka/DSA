import java.util.*;
public class MaxVowelsInSubString
{
	public static int maxVowels(String s,int k)
	{
		int count=0;
		for(int i=0;i<k;i++)
		{
			if(isVowel(s.charAt(i)))
			{
				count++;
			}
		}
		int maxCount=count;
		for(int i=k;i<s.length();i++)
		{
			if(isVowel(s.charAt(i-k)))
			{
				count--;	
			}
			if(isVowel(s.charAt(i)))
			{
				count++;
			}
			maxCount=Math.max(maxCount,count);
		}
		return maxCount;
	}
	public static boolean isVowel(char ch)
	{
		return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String s=sc.next();
		System.out.println("enter window size");
		int k=sc.nextInt();
		int result=maxVowels(s,k);
		System.out.println("MaxCount "+result);
	}
}