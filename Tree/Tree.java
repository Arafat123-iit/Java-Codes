package Tree;

import java.util.Stack;

class Node
{
	int key;
	Node left,right;
	
	public Node(int data)
	{
		key=data;
		left=right=null;
	}
	
}

public class Tree {

	Node root;
	
	Tree()
	{
		root=null;
	}
	
	public void preOrder(Node n)
	{
		if(n==null)return;
		
		System.out.print(n.key+" ");
		
		preOrder(n.left);
		preOrder(n.right);
		
	}
	
	public void inOrder(Node n)
	{
		if(n==null)return;
		
		inOrder(n.left);
		System.out.print(n.key+" ");
		inOrder(n.right);
		
	}
	
	public void inorderIterative(Node n)
	{
		Stack<Node> s=new Stack<Node>();
		
		while(n!=null || s.size()>0)
		{
			while(n!=null)
			{
				s.add(n);
				n=n.left;
			}
			
			Node a=s.pop();
			System.out.print(a.key+" ");
			
			n=a.right;
		}
	}
	
	public void postOrder(Node n)
	{
		if(n==null)return;
		
		postOrder(n.left);
		postOrder(n.right);
		
		System.out.print(n.key+" ");
	}
	
	
	
}
