import java.util.*;
class Palindromic_Substring
{
	public static int palinsubstring(String s)
	{
		if(s==null || s.length()==0)
		return 0;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			count+=expand(s,i,i);
			count+=expand(s,i,i+1);
		}
		return count;
	}
	private static int expand(String s,int left,int right)
	{
		int count=0;
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
		{
			count++;
			left--;
			right++;
		}
		return count;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		int result=palinsubstring(s);
		System.out.println("count "+result);
	}
}