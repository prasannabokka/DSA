import java.util.*;
class ValidParenthesis
{
	public static int valid_parenthesis(String s)
	{
		Stack<Integer> st=new Stack<>();
		st.push(-1);
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				st.push(i);
			}
			else
			{
				st.pop();
				if(st.isEmpty())
				{
					st.push(i);
				}
				else
				{
					max=Math.max(max,i-st.peek());
				}
			}
		}
		return max;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter parenthesis string");
		String s=sc.nextLine();
		int ans=valid_parenthesis(s);
		System.out.println("valid parenthesis length"+ans);
	}
}
		
	