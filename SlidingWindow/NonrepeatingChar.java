import java.util.*;
public class NonrepeatingChar
{
	public static int longestSubString(String s)
	{
		HashSet<Character> hs=new HashSet<>();
		int left=0;
		int max=0;
		for(int right=0;right<s.length();right++)
		{
			while(hs.contains(s.charAt(right)))
			{
				hs.remove(s.charAt(left));
				left++;
			}
			hs.add(s.charAt(right));
			max=Math.max(max,right-left+1);
		}
		return max;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		int result=longestSubString(s);
		System.out.println("longest substring "+result);
	}
}