// package BSTJava;
import java.util.*;
import java.lang.String;

public class BSTinCharacter {
	static class Node{
		char data;
		Node left, right;
		Node(char data){
			this.data = data;
		}
	}
	
	
	
	
//	1.creating the insert function....
	public static Node insert(Node root, char values) {
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
	
	
	
	
	
	
//	2.creating serach function....
	public static boolean search(Node root, char key) {
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
	
	
	
	
//	3. Delete function....
	public static Node delete(Node root, char key) {
		if(root.data>key) {
			root.left = delete(root.left, key);
		}
		else if(root.data<key) {
			root.right = delete(root.right, key);
		}
		
		else {
//			case1 : having leaf node
			if(root.left==null && root.right==null) {
				return null;
			}
//			case 2 : having one node
			if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			Node IS = findInorderSuccessor(root.right);
			IS.data = root.data;
			root.right = delete(root.right, IS.data);
		}
		return root;
			
	}
	public static Node findInorderSuccessor(Node root) {
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
		int h = Math.max(lh, rh)+1;
		return h;
	}
	
	
	
	
	
//	5.function to find the number of nodes...
	public static int NumNode(Node root) {
		if(root==null) {
			return 0;
		}
		int l = height(root.left);
		int r = height(root.right);
		int T = l+r+1;
		return T;
	}
	
	
	
	
	
	
//	6.function to find the range of the given number...
	public static void Range(Node root, char k1, char k2) {
		if(root==null) {
			return;
		}
		if(root.data>=k1 && root.data<=k2) {
			Range(root.left, k1, k2);
			System.out.print(root.data+" ");
			Range(root.right, k1, k2);	
		}
		else if(root.data>k1) {
			Range(root.left, k1, k2);
		}
		else {
			Range(root.right, k1, k2);
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

	

	
//	11.function to find the max element
	public static void max(Node root) {
		if(root==null) {
			return;
		}
		while(root.right!=null) {
			root = root.right;
		}
		System.out.println("Max element of tree is :"+root.data);
	}
	
	
	
//	12.function to find the min element
	public static void min(Node root) {
		if(root==null) {
			return;
		}
		while(root.left!=null) {
			root = root.left;
		}
		System.out.println("Max element of tree is :"+root.data);
	}
	
	
	
//	13. find the order level....
	public static int levelorder(Node root, char key, int level) {
		if(root==null) {
			return 0;
		}
		if(root.data==key) {
			return level;
		}
		else if(root.data>key){
			return levelorder(root.left, key, level+1);
		}
		else {
			return levelorder(root.right, key , level+1);
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
			return external(root.left)+external(root.right);
		}
	}
	
	
	
	
//	15.Finding the internal and external nodes
	public static void internalNodes(Node root) {
		if(root==null) {
			return;
		}
		if(root.left!=null || root.right!=null) {
			System.out.print(root.data+" ");
		}
		internalNodes(root.left);
		internalNodes(root.right);
	}
	
	
	
	public static void externalNodes(Node root) {
		if(root==null) {
			return;
		}
		if(root.left==null && root.right==null) {
			System.out.print(root.data+" ");
		}
		internalNodes(root.left);
		internalNodes(root.right);
	}
	
	
	
	
	
	public static void main(String[] args) {
		char values[]= {'e','a', 'c', 'd', 'f', 'g', 'h', 'k'};
		Node root = null;
		BSTinCharacter b = new BSTinCharacter();
		
		
		
		
//		1. inserting the characters aargs
		for(int i = 0;i<values.length;i++) {
			root = insert(root, values[i]);
		}
		
		
		
		
		
//		2. printing the serach function...
		
//		if(search(root, 'z')) {
//			System.out.println("key found");
//		}
//		else {
//			System.out.println("key not found");
//		}
		
		
		
		
//		3.deleting the node
//		delete(root, 'a');
//		inorder(root);
//		System.out.println();
		

		
		
//		4.finding the height of tree..
//		System.out.println("Height of tree is :"+b.height(root));
		
		
		
//		5.finding the Numof Nodes of tree..
//		System.out.println("Total number of nodes of tree is :"+b.NumNode(root));
		
		
		
//		6.finding the range between the nodes
//		Range(root, 'd', 'g');
		
		
//		7.printing the preorder...
//		preorder(root);
//		System.out.println();
		
		
//		8.printing the inorder..
//		inorder(root);
//		System.out.println();
		
		
//		9.printing the postorder..
//		postorder(root);
//		System.out.println();
		
		
		
//		11.printing the max element;
//		max(root);
		
		
//		12.printing the min element;
//		min(root);
		
		
		
//		13.printing the level of tree...
//		for(int i=0;i<values.length;i++) {
//			System.out.println("level of "+values[i]+" is "+levelorder(root, values[i], 1));
//		}
//		
//		for printing the level of particular node....
//		int level = b.levelorder(root, 'd', 1);
//		if(level==-1) {
//			System.out.println("level not found");
//		}
//		else {
//			System.out.println("Level of given key is :"+level);
//		}
		
		
		
//		14.printing the total number of internal and external nodes...
//		System.out.println("Total number of internal nodes are :"+b.internal(root));
//		System.out.println("Total number of exteranl nodes are :"+b.external(root));
		
		
//		15.printing the internal nodes 
//		internalNodes(root);
//		System.out.println();
//		externalNodes(root);
		
		

		
	}

}
