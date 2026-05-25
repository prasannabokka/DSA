import java.util.*;			
class MyQueue
{
	Stack<Integer> input;
	Stack<Integer> output;
	public MyQueue()
	{
		input=new Stack<>();
		output =new Stack<>();
	}
	public void push(int x)
	{
		input.push(x);
	}
	private void transfer()
	{
		while(!input.isEmpty())
		{
			output.push(input.pop());
		}
	}
	public int pop()
	{
		if(output.isEmpty())
		{	
			transfer();
		}
		return output.pop();
	}
	public int top()
	{
		if(output.isEmpty())
		{
			transfer();
		}
		return output.peek();
	}
	public Boolean empty()
	{
		return input.isEmpty() && output.isEmpty();
	} 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		MyQueue q=new MyQueue();	
		while(true)
		{
			System.out.println("\n1 push");
			System.out.println("2 pop");
			System.out.println("3 top");
			System.out.println("4 empty");
			System.out.println("5 exit");
			System.out.println("enter choice");
			int choice=sc.nextInt();
			switch(choice)		
			{
				case 1:
					System.out.println("enter element");
					int x=sc.nextInt();
					q.push(x);
					System.out.println("element pushed");
					break;
				case 2:
   	 				if(q.empty())
       					 	System.out.println("Queue is empty");
    					else
        					System.out.println("Element popped: " + q.pop());
    						break;

				case 3:
    					if(q.empty())
        					System.out.println("Queue is empty");
    					else
        					System.out.println("Top element: " + q.top());
    						break;
				case 4:
					System.out.println("empty?"+q.empty());
					break;
				case 5:
					System.out.println("existing");
					sc.close();
					return;
				default:
					System.out.println("invalid choice");
			}
		}
	}
}
