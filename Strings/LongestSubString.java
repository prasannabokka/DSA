import java.util.*;
class LongestSubString
{
	public static int longestSubString(String s)
	{
		int max=0;
		int left=0;
		HashSet<Character> hs=new HashSet<>();
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
		Scanner sc =new Scanner(System.in);
		System.out.println("enter String");
		String s = sc.nextLine();
		int result = longestSubString(s);
		System.out.println("MaxLength " +result);
	}
}