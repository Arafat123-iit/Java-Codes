package Tree;

public class TestTree {

	public static void main(String[] args) {
		
		Tree t=new Tree();
		
		t.root=new Node(1);
		
		t.root.left=new Node(2);
		t.root.right=new Node(3);
		t.root.left.left=new Node(4);
		t.root.left.right=new Node(5);
		
		t.preOrder(t.root);
		System.out.println();
		t.inOrder(t.root);
		System.out.println();
		t.postOrder(t.root);
		System.out.println();
		t.inorderIterative(t.root);
		
		

	}

}
