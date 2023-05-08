package Trees;

public class BuildTree {
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	static class BinaryTree{
		static int idx=-1;
//		here we are bilding a tree using recuresion.
		public static Node createTree(int nodes[]) {
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = createTree(nodes);
			newNode.right = createTree(nodes);
			return newNode;
		}
//		creating a function of preorder in which first we print the root, then root left and then root right.
		public static void preorder(Node root) {
			if(root == null) {
				return;
			}
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
//		creating a inorder function in which first we are printing the 
//		root left subtree, then root and then root right subtree.
		public static void inorder(Node root){
			if(root==null) {
				return;
			}
			inorder(root.left);
			System.out.println(root.data+" ");
			inorder(root.right);
		}
//		creating postorder function; in which first we are printing the left subtree then 
//		right subtree and then root of the tree using recursion.
		public static void postorder(Node root) {
			if(root==null) {
				return;
			}
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data+" ");
		}
	}
	
	public static void main(String[] args) {
		int nodes[]= {1, 2 , 4 , -1 , -1, 5 , -1, -1, 3, -1, 6, -1, -1};
		BinaryTree tree = new BinaryTree();
		
		Node root = tree.createTree(nodes);
//		tree.preorder(root);
//		tree.inorder(root);
		tree.postorder(root);
	}

	

}
