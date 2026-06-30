import java.util.*;
class SubStringContainsThreeCharacters
{
	public static int substring(String s)
	{
		int n=s.length();
		int ans=0;
		int left=0;
		int[] count=new int[3];
		for(int right=0;right<n;right++)
		{
			count[s.charAt(right)-'a']++;
			while(count[0]>0 && count[1]>0 && count[2]>0)
			{
				ans+=n-right;
				count[s.charAt(left)-'a']--;
				left++;
			}
		}
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		int result=substring(s);
		System.out.println("No of subStrings "+result);
	}
}