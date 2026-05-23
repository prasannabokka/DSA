import java.util.*;
class MyStack
{
	Queue<Integer> q1;
	Queue<Integer> q2;
	public MyStack()
	{
		q1=new LinkedList<>();
		q2=new LinkedList<>();
	}
	public void push(int x)
	{
		q2.offer(x);
		while(!q1.isEmpty())	
		{
			q2.offer(q1.poll());
		}
		Queue<Integer> temp=q1;
		q1=q2;
		q2=temp;
	}
	public int pop()
	{
		return q1.poll();
	}
	public int top()
	{
		return q1.peek();
	}
	public boolean empty()
	{
		return q1.isEmpty();
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		MyStack st=new MyStack();
		while(true)
		{
			System.out.println("\n1 push");
			System.out.println("2 pop");
			System.out.println("3 top");
			System.out.println("4 isEmpty");
			System.out.println("5 exit");
			System.out.println("enter choice");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("enter element");
					int x=sc.nextInt();
					st.push(x);
					System.out.println("element pushed");
					break;
				case 2:
					
					System.out.println("element popped "+st.pop());
					break;
				case 3:
					System.out.println("top element "+st.top());
					break;
				case 4:
					System.out.println("is empty "+st.empty());
					break;
				case 5:
					System.out.println("existing..");
					sc.close();
					return;
				default:
					System.out.println("invalid choice");
			}
		}
	}
}