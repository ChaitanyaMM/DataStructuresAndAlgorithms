package com.datastructures.tree;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTree {
	int data;
	BinaryTree left, right;

	BinaryTree(int data) {
		this.data = data;
		this.left = this.right = null;

	}

	BinaryTree() {

	}
}

public class BinaryTreeOperations {

	static BinaryTree tree;

	static void inOrderTraversal(BinaryTree root) {

		if (root == null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.println(root.data + " ");
		inOrderTraversal(root.right);

	}

	static void preOrderTraversal(BinaryTree root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data + " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);

	}

	static void postOrderTraversal(BinaryTree root) {
		if (root == null) {
			return;
		}
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.println(root.data + " ");
	}

	static void levelOrderTraversal(BinaryTree root) {
		int height = height(root);

		for (int i = 1; i <= height; i++) {

			currentLevel(root, i);
		}

	}

	static void currentLevel(BinaryTree node, int level) {

		if (node == null) {
			return;
		}
		if (level == 1) {
			System.out.print(node.data + " ");
		} else if (level > 1) {
			currentLevel(node.left, level - 1);
			currentLevel(node.right, level - 1);
		}

	}

	static void insertData(int arr[], BinaryTree root) {
		for (int i = 0; i < arr.length; i++) {
			insert(root, arr[i]);
		}

	}
	
	static void insert(BinaryTree root, int key) {
		BinaryTree temp = root;

		if (temp == null) {
			temp = new BinaryTree(key);
		}

		Queue<BinaryTree> q = new LinkedList<>();
		q.add(temp);

		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();

			if (temp.left == null) {
				temp.left = new BinaryTree(key);
				break;

			} else {
				q.add(temp.left);
			}
			if (temp.right == null) {
				temp.right = new BinaryTree(key);
				break;
			} else {
				q.add(temp.right);
			}

		}

	}

	

	static int countNodes(BinaryTree root) {
		if (root != null)
			return 1 + countNodes(root.left) + countNodes(root.right);
		return 0;
	}

	static int sumNodesData(BinaryTree root) {
		if (root != null)

			return sumNodesData(root.left) + sumNodesData(root.right) + root.data;
		return 0;
	}

	static int degree2nodes(BinaryTree root) {

		if (root != null) {
			int x = degree2nodes(root.left);
			int y = degree2nodes(root.right);

			if (root.left != null & root.right != null) {
				return x + y + 1;
			} else {
				return x + y;

			}
		}
		return 0;

	}

	static int height(BinaryTree root) { // recursive
		if (root == null) {
			return 0;
		} else {
			int leftChild = height(root.left);
			// System.out.println("leftChild :-> " + leftChild);
			int rightChild = height(root.right);
			// System.out.println("rightChild :-> " + rightChild);

			return leftChild > rightChild ? leftChild + 1 : rightChild + 1;

		}

	}

	static int height_iterative(BinaryTree root) { // recursive
		if (root == null) {
			return 0;
		}
		BinaryTree temp;
		Queue<BinaryTree> q = new LinkedList<>();
		q.add(root);
		int height = 0;

		while (!q.isEmpty()) {
			int count = q.size();
			if (count == 0) {
				return height;
			}
			height++;

			while (count > 0) {
				temp = q.peek();
				q.remove();

				if (temp.left != null) {
					q.add(temp.left);
				}

				if (temp.right != null) {
					q.add(temp.right);
				}

				count--;

			}

		}

		return height;

	}

	static void searchKey(BinaryTree tree, int key) {
		int level = 1;
		if (tree != null) {
			level++;

			if (tree.data == key) {
				level++;

				System.out.println("found  key : " + key + " at level :" + level);
			} else {
				searchKey(tree.left, key);
				searchKey(tree.right, key);

			}

		}
	}

	static void deleteDeepest(BinaryTree root, BinaryTree lastNode) {

		Queue<BinaryTree> q = new LinkedList<>();
		q.add(root);

		BinaryTree temp;
		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();

			if (temp == lastNode) {
				temp = null;
				return;
			}

			if (temp.left != null) {
				if (temp.left == lastNode) {
					temp.left = null;
					return;
				} else {
					q.add(temp.left);
				}

			}

			if (temp.right != null) {
				if (temp.right == lastNode) {
					temp.right = null;
					return;
				} else {
					q.add(temp.right);
				}

			}

		}

	}

	static void delete(BinaryTree tree, int key) {

		if (tree != null) {

			if (tree.left == null && tree.right == null) {
				if (tree.data == key) {
					tree = null;
					return;
				} else
					return;
			}

			Queue<BinaryTree> q = new LinkedList<>();
			q.add(tree);
			BinaryTree temp = null;
			BinaryTree keyNodetoDelete = null;

			while (!q.isEmpty()) {
				temp = q.peek();
				q.remove();

				if (temp.data == key) {
					keyNodetoDelete = temp;
				}
				if (temp.left != null)
					q.add(temp.left);

				if (temp.right != null)
					q.add(temp.right);

			}

			if (keyNodetoDelete != null) {
				int x = temp.data;
				System.out.println("x :{} "+x);
				deleteDeepest(tree, temp);
				keyNodetoDelete.data = x;

			}

		}

	}

	public static int findLevel(BinaryTree root, int x, int index, int level) {
		// return if the tree is empty or level is already found
		if (root == null || level != 0) {
			return level;
		}

		if (root.data == x) {
			level = index;

		}

		level = findLevel(root.left, x, index + 1, level);
		level = findLevel(root.right, x, index + 1, level);

		return level;
	}

	static void printcousins(BinaryTree root, int key, int level) {

		if (root != null) {

			if (level == 1) {
				System.out.println("cousins " + root.data + " ");

			}
			if (!(root.left != null && root.left.data == key || root.right != null && root.right.data == key)) {
				printcousins(root.left, key, level - 1);
				printcousins(root.right, key, level - 1);

			}
		}

	}

	static void getCousinsOfGivenNode(BinaryTree root, int key) {

		int level = findLevel(root, key, 1, 0);

		printcousins(root, key, level);

	}

	static int getSibilingsOfGivenNode(BinaryTree root, int key) {
		int sibiling = 0;

		if (root != null) {

			if (root.data == key) {
				System.out.println("Given key is root it wont have sibilings");

			}
			Queue<BinaryTree> q = new LinkedList<>();
			q.add(root);
			BinaryTree temp;
			while (!q.isEmpty()) {

				temp = q.peek();
				q.remove();

				if (temp.left != null) {
					if (temp.left.data == key) {
						sibiling = temp.right.data;
					}
					q.add(temp.left);
				}
				if (temp.right != null) {
					if (temp.right.data == key) {
						sibiling = temp.left.data;
					}
					q.add(temp.right);
				}

			}

		}
		return sibiling;

	}

	public static void main(String[] args) {

		tree = new BinaryTree(10);

		int[] arr = { 20, 30, 40, 50, 60, 70 };
 
		insertData(arr, tree);
		System.out.println();

//		inOrderTraversal(tree);
//		System.out.println();
//		
//		preOrderTraversal(tree);
//		System.out.println();
//
//		
//		postOrderTraversal(tree);
//		System.out.println();

		int height = height(tree);
		System.out.println("========= " + height);
//		int height2 = height_iterative(tree);
//		System.out.println("========= " + height2);

		levelOrderTraversal(tree);

		searchKey(tree, 70);

		int nodes = countNodes(tree);
		System.out.println("nodes" + nodes);
		int sumNodes = sumNodesData(tree);
		System.out.println("sumNodes" + sumNodes);

		int result = degree2nodes(tree);
		System.out.println("result " + result);

		inOrderTraversal(tree);

		int sibiling = getSibilingsOfGivenNode(tree, 70);
		System.out.println("sibiling " + sibiling);

		getCousinsOfGivenNode(tree, 40);

		System.out.println();

		delete(tree, 40);
		preOrderTraversal(tree);

	}

}
