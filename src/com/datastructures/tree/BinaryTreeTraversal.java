package com.datastructures.tree;

public class BinaryTreeTraversal {

//    +++++++++	Depth First Traversals ++++++++++++++++++ //
	// Inorder Traversal (Left-Root-Right)
	// Preorder Traversal (Root-Left-Right)
	// Postorder Traversal (Left-Right-Root)

	// Root of Binary Tree
	Node root;

	BinaryTreeTraversal() {
		root = null;
	}

	void postorder(Node node) {
		if (node == null)
			return;

		// Traverse left
		postorder(node.left);
		// Traverse right
		postorder(node.right);
		// Traverse root
		System.out.print(node.item + "->");
	}

	void inorder(Node node) {
		if (node == null)
			return;

		// Traverse left
		inorder(node.left);
		// Traverse root
		System.out.print(node.item + "->");
		// Traverse right
		inorder(node.right);
	}

	void preorder(Node node) {
		if (node == null)
			return;

		// Traverse root
		System.out.print(node.item + "->");
		// Traverse left
		preorder(node.left);
		// Traverse right
		preorder(node.right);
	}

	void LevelOrder() // level order is called as BFT (Breadth first travel)
	{
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++)
			CurrentLevel(root, i);
	}

	int height(Node root) {
		if (root == null)
			return 0;
		else {
			int lheight = height(root.left);
			//System.out.println("lheight :-> "+lheight);
			int rheight = height(root.right);
			//System.out.println("rheight :-> "+rheight);

			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

	void CurrentLevel(Node root, int level) {
		if (root == null) {
			return;
		}
		if (level == 1) {
			System.out.print(root.item + " ");
		} else if (level > 1) {
			CurrentLevel(root.left, level - 1);
			CurrentLevel(root.right, level - 1);
		}
	}

	public static void main(String[] args) {
		BinaryTreeTraversal tree = new BinaryTreeTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(12);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(6);
		
		tree.root.right.left = new Node(13);
		tree.root.right.right = new Node(16);
		
		tree.root.left.left.left = new Node(21);
		tree.root.left.left.right = new Node(22);



		System.out.println("Inorder traversal");
		tree.inorder(tree.root);

		System.out.println("\nPreorder traversal ");
		tree.preorder(tree.root);

		System.out.println("\nPostorder traversal");
		tree.postorder(tree.root);
		
		
		System.out.println("\nLevelOrder traversal");
		tree.LevelOrder();
	}
}
