import java.util.*;
class ZigZag
{
	public static String zigzag(String s,int numsRows)
	{
		if(numsRows == 1 || s.length()<=0)
		{
			return s;
		}
		StringBuilder[] rows = new StringBuilder[numsRows];
		for(int i=0;i<numsRows;i++)
		{
			rows[i] = new StringBuilder();
		}
		int i=0;
		while(i<s.length())
		{
			for(int j=0;j<numsRows && i<s.length();j++)
			{
				rows[j].append(s.charAt(i++));
			}
			for(int j=numsRows-2;j>0 && i<s.length();j--)
			{
				rows[j].append(s.charAt(i++));
			}
		}
		StringBuilder result = new StringBuilder();
		for(StringBuilder row:rows)
		{
			result.append(row);
		}
		return result.toString();
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s= sc.nextLine();
		System.out.println("enter no of rows");
		int numsRows=sc.nextInt();
		String res = zigzag(s,numsRows);
		System.out.println("result "+res);
	}
}