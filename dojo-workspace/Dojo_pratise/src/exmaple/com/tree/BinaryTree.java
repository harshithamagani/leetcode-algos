package exmaple.com.tree;

public class BinaryTree {
	public Node root;
	
	public BinaryTree() {
		this.root = null;
	}
	
	public void insertNode(int data){
		if(root == null) {
			Node newNode = new Node(data);
			root = newNode;
			return ;
		}
		insertNode(data,root);
	}

	private void insertNode(int data, Node node) {
		
		if(data > node.data) {
			if(node.right == null) {
				Node newNode = new Node(data);
				node.right = newNode;
			}
			else {
				insertNode(data ,node.right);
			}
		}
		else {
			if(node.left == null) {
				Node newNode = new Node(data);
				node.left = newNode;
			}
			else {
				insertNode(data ,node.left);
			}	
		}
	}
	
	public void inOrderPrint(){
		inOrderPrint(root);
	}

	private void inOrderPrint(Node node) {
		if(node == null) {
			return;
		}
		inOrderPrint(node.left);
		System.out.println(node.data);
		inOrderPrint(node.right);
	}
	public static void main(String[] args) {
		BinaryTree b1 = new BinaryTree();
		b1.insertNode(4);
		b1.insertNode(3);
		b1.insertNode(2);
		b1.insertNode(1);
		b1.insertNode(6);
		b1.insertNode(5);
		b1.insertNode(7);
		
		b1.inOrderPrint();
	}
}
