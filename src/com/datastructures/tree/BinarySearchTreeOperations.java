package com.datastructures.tree;

public class BinarySearchTreeOperations {
	// Binary Search Tree operations in Java

	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;

	BinarySearchTreeOperations() {
		root = null;
	}

	void insert(int key) {
		root = insertKey(root, key);
	}

	// Insert key in the tree
	Node insertKey(Node root, int key) {
		// Return a new node if the tree is empty
		if (root == null) {
			root = new Node(key);
			return root;
		}

		// Traverse to the right place and insert the node
		if (key < root.key)
			root.left = insertKey(root.left, key);
		else if (key > root.key)
			root.right = insertKey(root.right, key);

		return root;
	}

	void inorder() {
		inorderRec(root);
	}

	// Inorder Traversal
	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.key + " -> ");
			inorderRec(root.right);
		}
	}

	void deleteKey(int key) {
		root = deleteRec(root, key);
	}

	Node deleteRec(Node root, int key) {
		// Return if the tree is empty
		if (root == null)
			return root;

		// Find the node to be deleted
		if (key < root.key)
			root.left = deleteRec(root.left, key);
		else if (key > root.key)
			root.right = deleteRec(root.right, key);
		else {
			// If the node is with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// If the node has two children
			// Place the inorder successor in position of the node to be deleted
			root.key = minValue(root.right);

			System.out.println("< Min Value > .... " + root.key + "rootright-> " + root.right.key);
			// Delete the inorder successor
			root.right = deleteRec(root.right, root.key);
		}

		return root;
	}

	// Find the inorder successor
	int minValue(Node root) {
		int minv = root.key;
		System.out.println("minv:-> " + minv);

		while (root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}

	void rightView() {

		rightViewOfBinaryTree(root);

	}

	void lefttView() {

		leftViewOfBinaryTree(root);

	}

	void rightViewOfBinaryTree(Node root) { //recursive
		if (root != null) {
			System.out.println("right view -> " + root.key);
			rightViewOfBinaryTree(root.right);
 		}

	}

	void leftViewOfBinaryTree(Node root) { //non_recursive
		while(root != null) {		
			System.out.println("left view ->" + root.key);
 			root=root.left;
		}

	}

	// Driver Program to test above functions

//	(a) Inorder (Left, Root, Right) : 4 2 5 1 3 
//	(b) Preorder (Root, Left, Right) : 1 2 4 5 3 
//	(c) Postorder (Left, Right, Root) : 4 5 2 3 1
	public static void main(String[] args) {
		BinarySearchTreeOperations tree = new BinarySearchTreeOperations();
		/*
		 *      50 / \ 30 70 / \ / \ 20 40 60 80
		 */
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		System.out.print("Inorder traversal: ");
		tree.inorder();

		System.out.println("\n\nAfter deleting 70");
		tree.deleteKey(30);
		System.out.print("Inorder traversal: ");
		tree.inorder();

		tree.rightView();
		tree.lefttView();
	}
}
