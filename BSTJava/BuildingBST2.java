package BSTJava;
import java.util.*;

public class BuildingBST2 {
	static class Node{
		int data;
		Node right, left;
		Node(int data){
			this.data = data;
		}
	}
	
	
	
	
	
	
//	1.function to insert the values....
	public static Node insert(Node root, int values) {
		if(root==null) {
			root = new Node(values);
			return root;
		}
		if(root.data>values) {
			root.left = insert(root.left, values);
		}
		else if(root.data<values) {
			root.right = insert(root.right, values);
		}
		return root;
	}

	
	
	
	
	
	
//	2.function to search the values in the node
	public static boolean search(Node root, int key) {
		if(root==null) {
			return false;
		}
		if(root.data==key) {
			return true;
		}
		
		if(root.data>key) {
			return search(root.left, key);
		}
		else {
			return search(root.right, key);
		}
	}
	

	
	
	
	
//	3.function to delete the node....
	public static Node delete(Node root, int key) {
		if(root.data>key) {
			root.left = delete(root.left, key);
		}
		else if(root.data<key) {
			root.right = delete(root.right, key);
		}
		
		else {
//			case 1: leaf node...
			if(root.left==null && root.right == null) {
				return null;
			}
//			case 2 : having one leaf node
			if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
//			case 3: having both the leaf nodes...
			Node IS = findinorderSuccsessor(root.right);
			root.data = IS.data;
			root.right = delete(root.right, IS.data);
		}
		return root;
		
	}
	
//	function to find the inorderSuccessor...
	public static Node findinorderSuccsessor(Node root) {
		while(root.left!=null) {
			root = root.left;
		}
		return root;
	}
	
	
	
	
	
	
	
	
//	4.function to find the height of the tree...
	public static int height(Node root) {
		if(root==null) {
			return 0;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		int ht = Math.max(lh, rh)+1;
		return ht;
	}
	
	
	
	
	
	
	
//	5.function to find the number of nodes...
	public static int NumNode(Node root) {
		if(root==null) {
			return 0;
		}
		int numlh = NumNode(root.left);
		int numrh = NumNode(root.right);
		int Tcount = numlh+numrh+1;
		return Tcount;
	}
	
	
	
	
	
	
	
	
	
	
//	6.function to find the range of the given number...
	public static void findRange(Node root, int k1, int k2) {
		if(root==null) {
			return;
		}
		
		if(root.data>=k1 && root.data<=k2) {
			findRange(root.left, k1, k2);
			System.out.print(root.data+" ");
			findRange(root.right,k1,k2);
		}
		
		else if(root.data>k1) {
			findRange(root.left,k1,k2);
		}
		else {
			findRange(root.right,k1,k2);
		}
	}

	
	
	
	
	
	

	

	
	
	
//	7.function to find the preorder....
	public static void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	
	
	
//	8.function for inorder...
	public static void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	
	
//	9.function to find postpost order....
	public static void postorder(Node root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}

	
	
	
//	10.finding the ways from roottoleaf...
	public static void Root2leaf(Node root, ArrayList<Integer> path) {
		if(root==null) {
			return;
		}
		path.add(root.data);
		if(root.left==null && root.right==null) {
			printPath(path);
		}
		Root2leaf(root.left, path);
		Root2leaf(root.right, path);
		path.remove(path.size()-1);
	}
	
//	printing the path from root to leaf.....
	public static void printPath(ArrayList<Integer> path) {
		for(int i=0;i<path.size();i++) {
			System.out.print(path.get(i)+"->");
		}
		System.out.print("null");
		System.out.println();
	}
	
	
	
	
	
	
//	11.function to find the max element
	public static void max(Node root) {
		if(root==null) {
			return;
		}
		while(root.right!=null) {
			root = root.right;
		}
		System.out.println("The max element is :"+root.data);
	}
	
	
	
	
	
//	12.function to find the min element
	public static void min(Node root) {
		if(root==null) {
			return;
		}
		while(root.left!=null) {
			root = root.left;
		}
		System.out.println("The min element is :"+root.data);
	}
	
	
	
	
//	13. find the order level....
	public static int Finding_level(Node root, int key, int level) {
		if(root==null) {
			return 0;
		}
		if(root.data==key) {
			return level;
		}
		else if(root.data>key) {
			return Finding_level(root.left, key, level+1);
		}
		else{
			return Finding_level(root.right, key, level+1);
		}
	}
	
	
	
	
//	14.finding the the count of external and internal nodes...
	public static int internal(Node root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null && root.right==null) {
			return 0;
		}
		else {
			return internal(root.left)+internal(root.right)+1;
		}
	}
	
	
	
	public static int external(Node root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null && root.right==null) {
			return 1;
		}
		else {
			return internal(root.left)+internal(root.right);
		}
	}
	
	
	
	
	
	
	
	
//	15.Finding the internal and external nodes
	public static void internalNode(Node root) {
		if(root==null) {
			return;
		}
		if(root.left!=null || root.right!=null) {
			System.out.print(root.data+" ");
		}
		internalNode(root.left);
		internalNode(root.right);
	}
	
	
	public static void externalNode(Node root) {
		if(root==null) {
			return;
		}
		if(root.left==null && root.right==null) {
			System.out.print(+root.data+" ");
		}
		externalNode(root.left);
		externalNode(root.right);

	}
	
	
	
	
	
	
//	16. find the parent of element of the given key
	public static void findParent(Node root, int key, int parent) {
		if(root==null) {
			return;
		}
		if(root.data==key) {
			System.out.println("Parent of given element is :"+parent);	
		}
		else {
			findParent(root.left, key, root.data);
			findParent(root.right, key, root.data);
			
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		int values[]= {8, 5, 3, 6, 10 , 11, 14};
		Node root = null;
		
		BuildingBST2 b = new BuildingBST2();
		
		
		
		
//		1.for inserting the data....
		
		for(int i=0;i<values.length;i++) {
			root = insert(root, values[i]);
		}
		
		
		

//		2.for seraching the key...
		
//		if(search(root, 5)) {
//			System.out.println("Key found..");
//		}
//		else {
//			System.out.println("Key not found..");
//		}
		
		
		
		
		
//		3.for deleting node...
		
//		System.out.println("After deletation...");
//		delete(root, 3);
//		inorder(root);
//		System.out.println();
		
		
		
		
		
//		4.for finding the height of tree....
		
//		System.out.println("height of tree is :"+b.height(root));
		
		
	
		
		
		
//		5.for finding the number of nodes in tree....
		
//		System.out.println("Total number of nodes in tree is :"+b.NumNode(root));
		
		
		
		
//		6.finding the range...
		
//		System.out.println("Range of the given nodes...");
//		findRange(root, 10, 11);
//		inorder(root);
//		System.out.println();
		
		
		
		
		
		
//		7.finding the preorder...
		
//		System.out.println("Preorder....");
//		preorder(root);
//		System.out.println();
	
	
		
		
		
//		8.finding the inorder..
		
//		System.out.println("inorder....");
//		inorder(root);
//		System.out.println();
		
		
		
		
		
		
//		9.finding the postorder...
		
//		System.out.println("postorder....");
//		postorder(root);
//		System.out.println();
		
		
		
//		10. finding the path from Root to leaf
		
//		System.out.println("Different paths from root to leaf are");
//		Root2leaf(root, new ArrayList<>());
		
		
		
//		11. printing the max element
		
//		max(root);
		
		
//		12.printing the min element
		
//		min(root);
		
		
		
		
//		13.Printing the level of root...

//		for(int i=0;i<values.length;i++) {
//			System.out.println("Level "+values[i]+" is :"+Finding_level(root,values[i], 1));
//		}
		
		
		
	
//		14.Printing the number of interanl and exteranal node...
//		System.out.println("Number of internal node are :"+b.internal(root));
//		System.out.println("Number of external node are :"+b.external(root));
		
		
		
		
//		15.Printing the internal and external nodes of BST..
//		System.out.println("Internal Nodes are...");
//		internalNode(root);
//		System.out.println();
//		System.out.println("Exteranl Nodes are....");
//		externalNode(root);
		
		
		
		
//		16.Printing the Parent of the given element..
//		findParent(root, 11, -1);
		
		
	}
}


