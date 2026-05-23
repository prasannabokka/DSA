import java.util.*;
class Node
{
	int data;
	Node left,right;
	Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}
class DeleteNode {
	public Node insertNode(Node root,int key)
	{
		if(root==null)
		return new Node(key);
		if(key<root.data)
		{
			root.left=insertNode(root.left,key);
		}
		else 
		{
			root.right=insertNode(root.right,key);
		}
		return root;
	}
    	public Node deleteNode(Node root, int key) {
        	if(root==null)
        	return null;
       	 	if(key<root.data)
        	{
            		root.left=deleteNode(root.left,key);
        	}
        	else if(key>root.data)
        	{
            		root.right=deleteNode(root.right,key);
        	}
       		 else
        	{
            		if(root.left==null)
            		{
                		return root.right;
            		}
            		if(root.right==null)
            		{
                		return root.left;
            		}
            		Node temp=root.right;
            		while(temp.left!=null)
            		{
               		 	temp=temp.left;
            		}
            		root.data=temp.data;
            		root.right=deleteNode(root.right,temp.data);
        	}
        	return root;
    	}
	void inorder(Node root)
	{
		if(root==null)
		return;
		inorder(root.left);
		System.out.println(" "+root.data);
		inorder(root.right);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		DeleteNode tree=new DeleteNode();
		Node root=null;
		System.out.println("enter no of nodes");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			root=tree.insertNode(root,x);
		}
		System.out.println("enter key to delete");
		int key=sc.nextInt();
		System.out.println("before deletion");
		tree.inorder(root);
		root=tree.deleteNode(root,key);
		System.out.println("after deletion");
		tree.inorder(root);
	}
}