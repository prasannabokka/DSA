import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class MaxTwinSum
{
	public static int twinSum(Node head)	
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		Node prev=null;
		Node curr=slow;
		while(curr!=null)
		{
			Node nextNode=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextNode;
		}
		int maxSum=0;
		Node first=head;
		Node second=prev;
		while(second!=null)
		{
			maxSum=Math.max(maxSum,first.data+second.data);
			first=first.next;
			second=second.next;
		}
		return maxSum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of nodes");
		int n=sc.nextInt();
		if(n%2!=0)
		{
			System.out.println("list size must be in even");	
			return;
		}
		Node head=null;
		Node tail=null;
		System.out.println("enter node");
		for(int i=0;i<n;i++)
		{
			int value=sc.nextInt();
			Node newNode=new Node(value);
			if(head==null)
			{
				head=newNode;
				tail=newNode;
			}
			else
			{
				tail.next=newNode;
				tail=newNode;
			}
		}
		int result=twinSum(head);
		System.out.println("max "+result);
	}
}
			