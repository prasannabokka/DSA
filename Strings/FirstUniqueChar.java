import java.util.*;
class FirstUniqueChar
{
	public static int firstunichar(String s)
	{
		int[] freq=new int[26];
		for(int i=0;i<s.length();i++)
		{
			freq[s.charAt(i)-'a']++;
		}
		for(int i=0;i<s.length();i++)
		{
			if(freq[s.charAt(i)-'a']==1)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");	
		String s=sc.nextLine();
		int result=firstunichar(s);
		System.out.println("first unique character "+result);
	}
}