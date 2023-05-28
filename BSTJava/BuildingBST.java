//package BSTJava;
//
//public class BuildingBST {
//	static class Node{
//		int data;
//		Node left, right;
//		Node(int data){
//			this.data = data;
//		}
//	}
//	
//	public static Node insert(Node root, int val) {
//		if(root == null) {
//			root = new Node(val);
//			return root;
//		}
//		if(root.data>val) {
//			root.left = insert(root.left, val);
//		}
//		else{
//			root.right = insert(root.right, val);
//		}
//		return root;
//	}
//	
//	
////	Searching the node
//	public static boolean search(Node root, int key) {
//		if(root == null) {
//			return false;
//		}
//		
//		if(root.data == key) {
//			return true;
//		}
//		
//		if(root.data>key) {
//			return search(root.left, key);
//		}
//		else {
//			return search(root.right, key);
//		}
//		
//		
//	}
//	
//	public static void inorder(Node root) {
//		if(root==null) {
//			return;
//		}
//		inorder(root.left);
//		System.out.print(root.data+" ");
//		inorder(root.right);
//	}
//	
//	public static Node delete(Node root, int val) {
//		if(root.data<val) {
//			root.right = delete(root.right, val);
//		}
//		else if(root.data>val) {
//			root.left = delete(root.left, val);
//		}
//		
//		else {
////			case 1 (leaf node is null no child)
//			if(root.left==null && root.right==null) {
//				return null;
//			}
//			
////			case 2 (if having single child)
//			if(root.left==null) {
//				return root.right;
//			}
//			else if(root.right==null){
//				return root.left;
//			}
//			
////			case 3 (having both child)
//			Node IS = FindInorderSuccessor(root.right);
//			root.data= IS.data;
//			root.right = delete(root.right, IS.data);	
//		}
//		return root;
//	}
//	
//	public static Node FindInorderSuccessor(Node root) {
//		if(root.left!=null) {
//			root= root.left;
//		}
//		return root;
//	}
//
//	public static void main(String[] args) {
//		int values[]= {8,5,3,1,4,6,10,11,14};
//		Node root = null;
//		for(int i=0;i<values.length;i++) {
//			root = insert(root, values[i]);
//		}
//		inorder(root);
//		System.out.println();
//		
//		
////		if(search(root, 6)) {
////			System.out.println("Key found");
////		}
////		else {
////			System.out.println("Key not found");
////		}
//		
//		System.out.println("After deletation");
//		delete(root, 11);
//		inorder(root);
//		System.out.println();
//
//	}
//
//}
































package BSTJava;
import java.util.*;

public class BuildingBST {
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
		}
	}

	
	
//	1.for inserting the values...
	public static Node insert(Node root, int val) {
		if(root==null) {
			root = new Node(val);
			return root;
		}
		if(root.data>val) {
			root.left = insert(root.left, val);
		}
		else if(root.data<val) {
			root.right = insert(root.right, val);
		}
		return root;
		
	}
	

	
	
	
	
	
	
	
	
//	2.function for searching the key...
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
		else{
			return search(root.right, key);
		}
	}
	

	
	
	
	
	
	
//	3.function to delete the node....
	public static Node delete(Node root, int val) {
		if(root.data>val) {
			root.left=delete(root.left,val);
		}
		else if(root.data<val) {
			root.right = delete(root.right,val);
		}
		else {
//			case 1: having leaf Node;
			if(root.left==null && root.right==null) {
				return null;
			}
//			case 2: having one child;
			if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			
//			case 3: having both child;
			Node IS = findInorderSuccessor(root.right);
			root.data = IS.data;
			root.right = delete(root.right, IS.data);
		}
		return root;
	}
	
//	function to find the inorder Successor;
	public static Node findInorderSuccessor(Node root) {
		if(root.left!=null) {
			root = root.left;
		}
		return root;
	}
	
	
	

	
	
	
	
	
//	4.function to find range between lowerbound and upperbound;
	public static void PrintinRange(Node root, int k1, int k2) {
		if(root==null) {
			return;
		}
//		case1: if root comes in between the range;
		if(root.data>=k1 && root.data<=k2) {
			PrintinRange(root.left, k1,k2);
			System.out.print(root.data+" ");
			PrintinRange(root.right,k1,k2);
		}
//		case 2: if root data is less then k1
		else if(root.data<k1) {
			PrintinRange(root.left, k1,k2);
		}
		else {
			PrintinRange(root.right,k1,k2);
		}
		
	}
	

	
	
	
	
	
	
////	5.function to Print the Path from Root to leaf;
	public static void PathRoot2Leaf(Node root, ArrayList<Integer> path) {
		if(root==null) {
			return;
		}
		path.add(root.data);
		if(root.left==null && root.right==null) {
			PrintPath(path);
		}
		PathRoot2Leaf(root.left, path);
		PathRoot2Leaf(root.right, path);
		path.remove(path.size()-1);
		
	}
	
////	fucntion to print the path
	public static void PrintPath(ArrayList<Integer> path) {
		for(int i=0;i<path.size();i++) {
			System.out.print(path.get(i)+"->");
		}
		System.out.print("NULL");
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
//	6.converting the given tree into preorder...
	public static void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	
//	7.creating the inorder function...
	public static void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
		
	
//	8.converting the given tree into postorder...
	public static void postorder(Node root) {
		if(root==null) {
			return;
		}
		preorder(root.left);
		preorder(root.right);
		System.out.print(root.data+" ");
	}
	
	
	
	
	
//	9.Finding the height of the tree...
	public static int height(Node root) {
		if(root == null) {
			return 0;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		return Math.max(lh, rh)+1;
		
	}
	
	
	
//	10. find the number of nodes in BST...
	public static int NumNode(Node root) {
		if(root==null) {
			return 0;
		}
		int count1 = NumNode(root.left);
		int count2 = NumNode(root.right);
		int Tcount = count1+count2+1;
		return Tcount;
	}
	
	
	
//	11.Validate the BST......
	public static boolean isValid(Node root, Node min, Node max) {
		if(root==null) {
			return true;
		}
		if(min!=null && root.data<=min.data) {
			return false;
		}
		else if(max!=null && root.data>=max.data) {
			return false;
		}
		return (isValid(root.left, min, root) && isValid(root.right, root, max));
	}
	
	public static void main(String[] args) {
		BuildingBST tree = new BuildingBST();
		
		int values[]= {8,5,3,6,10,11,14};
//		int values[]= {0,1,1};
//		1.Inserting the elements inside the tree....
		
		Node root = null;
		for(int i=0;i<values.length;i++) {
			root = insert(root, values[i]);
		}
		
		
		
		
//		2.Searching the Given elements inside the tree...
		
//		if(search(root, 9)) {
//			System.out.println("Element found");
//		}
//		else {
//			System.out.println("Element not found");
//		}
		
		
		

//	    3.Deleting the given elements....	
		
//		System.out.println("After Deletation");
//		delete(root, 10);
//		inorder(root);
//		System.out.println();
		

		
		
		
//		4.Printing the Elements in given range....
		
//		System.out.println("Range");
//		PrintinRange(root,5,12);
		
		
		
		
		
//		5.Printing the path from Root to leaf......
		
//		PathRoot2Leaf(root, new ArrayList<>());
		
		
		
		
		
//		6.printing the preorder...
		
//		System.out.println("Printing the Preorder of given sequence..");
//		preorder(root);
//		System.out.println();
		
		
		
		
//		7.Printing the inorder...
		
//		System.out.println("Printing the inorder of given sequence...");
//		inorder(root);
//		System.out.println();
		
		
		
		
//		8.printing the Postorder...
		
//		System.out.println("Printing the Postorder of given sequence..");
//		postorder(root);
//		System.out.println();
		
		
//		9.Printing the height of tree..
		
//		System.out.println("The height of the tree is :"+tree.height(root));
		
		
//		10.Printing the number of nodes in bst...
//		System.out.println("Total number of nodes :"+tree.NumNode(root));
		
		
//		11. Validating wheather the tree is valid or not..
		if(isValid(root, null, null)) {
			System.out.println("Valid BST");
		}
		else{
			System.out.println("not valid BST");
		}
		}
	}

