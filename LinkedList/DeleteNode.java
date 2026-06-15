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
class DeleteNode
{
	public static Node deleteNode(Node head)
	{
		if(head==null || head.next==null)
		{
			return null;
		}
		Node prev=null;
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			prev=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		prev.next=slow.next;
		return head;
	}
	public static void display(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{	
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of nodes");
		int n=sc.nextInt();
		Node head=null;
		Node tail=null;
		System.out.println("enter value");
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
		System.out.println("before deletion");
		display(head);
		head=deleteNode(head);
		System.out.println("after deletion");
		display(head);
	}
}
		
			