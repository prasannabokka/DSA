import java.util.*;
public class GoodString
{
	public static int goodString(String s)
	{
		int count=0;
		for(int i=0;i<=s.length()-3;i++)
		{
			char a=s.charAt(i);
			char b=s.charAt(i+1);
			char c=s.charAt(i+2);
			if(a!=b && b!=c && c!=a)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		int result=goodString(s);
		System.out.println("count Of Good String "+result);
	}
}