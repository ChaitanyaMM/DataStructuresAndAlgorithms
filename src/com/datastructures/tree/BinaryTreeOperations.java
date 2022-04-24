//package com.datastructures.tree;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//class NodeBinarayTree {
//	int data;
//	NodeBinarayTree left;
//	NodeBinarayTree right;
//
//	NodeBinarayTree(int key) {
//		this.data = key;
//		this.left = this.right = null;
//	}
//
//}
//
//public class BinaryTreeOperations {
//	NodeBinarayTree root;
//
//	static void inOrder(NodeBinarayTree root) {
//		if (root != null) {
//			inOrder(root.left);
//			System.out.println("" + root.data + " ");
//			inOrder(root.right);
//
//		}
//
//	}
//
//	// Function to delete deepest
//	// element in binary tree
//	static void deleteDeepest(NodeBinarayTree root, NodeBinarayTree delNode) {
//		Queue<NodeBinarayTree> q = new LinkedList<NodeBinarayTree>();
//		q.add(root);
//
//		NodeBinarayTree temp = null;
//
//		// Do level order traversal until last node
//		while (!q.isEmpty()) {
//			temp = q.peek();
//			q.remove();
//
//			if (temp == delNode) {
//				temp = null;
//				return;
//
//			}
//			if (temp.right != null) {
//				if (temp.right == delNode) {
//					temp.right = null;
//					return;
//				} else
//					q.add(temp.right);
//			}
//
//			if (temp.left != null) {
//				if (temp.left == delNode) {
//					temp.left = null;
//					return;
//				} else
//					q.add(temp.left);
//			}
//		}
//	}
//
//	static void delete(NodeBinarayTree node, int key) {
//		if (node == null) {
//			return;
//		}
//
//		if (node.left == null && node.right == null) {
//			if (node.data == key) {
//				node = null;
//				return;
//			} else
//				return;
//		}
//
//		Queue<NodeBinarayTree> q = new LinkedList<NodeBinarayTree>();
//		q.add(node);
//		NodeBinarayTree temp = null, keyNode = null;
//
//		System.out.println("size of queue :" + q.size());
//		// Do level order traversal until
//		// we find key and last node.
//		while (!q.isEmpty()) {
//			temp = q.peek();
//			System.out.println("temp data :-> " + temp.data);
//			q.remove();
//
//			if (temp.data == key)
//				keyNode = temp;
//
//			if (temp.left != null)
//				q.add(temp.left);
//
//			if (temp.right != null)
//				q.add(temp.right);
//		}
//
//		if (keyNode != null) {
//			int x = temp.data;
//			System.out.println("node data " + keyNode.data + "temp data " + temp.data);
//			deleteDeepest(node, temp);
//			keyNode.data = x;
//		}
//
//	}
//
//	static void levelOrder(NodeBinarayTree root) {
//		int h = height(root);
//		int i;
//		for (i = 1; i <= h; i++)
//			currentLevel(root, i);
//	}
//
//	static void currentLevel(NodeBinarayTree node, int level) {
//
//		if (node == null) {
//			return;
//		}
//		if (level == 1) {
//			System.out.print(node.data + " ");
//		} else if (level > 1) {
//			currentLevel(node.left, level - 1);
//			currentLevel(node.right, level - 1);
//		}
//
//	}
//
//	static int height(NodeBinarayTree node) {
//		if (node == null) {
//			// System.out.println("empty Node");
//			return 0;
//		} else {
//			int leftChild = height(node.left);
//			System.out.println("leftChild :-> " + leftChild);
//			int rightChild = height(node.right);
//			System.out.println("rightChild :-> " + rightChild);
//
//			return leftChild > rightChild ? leftChild + 1 : rightChild + 1;
//
//		}
//
//	}
//
//	static int countNodes(NodeBinarayTree root) {
//		if (root != null)
//			return countNodes(root.left) + countNodes(root.right) + 1;
//		return 0;
//
//	}
//
//	static int sumofNodesData(NodeBinarayTree root) {
//		if (root != null)
//			return sumofNodesData(root.left) + sumofNodesData(root.right) + root.data;
//		return 0;
//
//	}
//
//	static int searchNode(NodeBinarayTree root, int key) {
//
//		int level = 0;
//		if (root == null) {
//			return -1;
//		}
//		if (root.data == key) {
//			System.out.println( "key :-> " +key);
//			return key;
//		}	
//
//		int left = searchNode(root.left, key);
//		System.out.println("left :-> "+left);
//		int right = searchNode(root.right, key);
//		System.out.println("right :-> "+right);
//
//		return left >right ? left: right;
//
//	}
//
//	static void getCousinsofNode(NodeBinarayTree root, int key) {
//
//		if (root == null) {
//			return;
//		} else {
//			int height = height(root);
//
//		}
//
//	}
//
//	static void getSibilingOfNode(NodeBinarayTree root, int key) {
//
//	}
//
//	public static void main(String[] args) {
//		// 1
//		// 2 3
//		// 4 5 6 7
//		// 8 9
//		NodeBinarayTree binaryTree = new NodeBinarayTree(1);
//		binaryTree.left = new NodeBinarayTree(2);
//		binaryTree.right = new NodeBinarayTree(3);
//		binaryTree.left.left = new NodeBinarayTree(4);
//		binaryTree.left.right = new NodeBinarayTree(5);
////		binaryTree.right.left = new NodeBinarayTree(6);
////		binaryTree.right.right = new NodeBinarayTree(7);
////		
////		binaryTree.right.left.left = new NodeBinarayTree(8);
////		binaryTree.right.left.right = new NodeBinarayTree(9);
////		
//
////		inOrder(binaryTree);
////		System.out.println("===================");
//
////		int height =height(binaryTree);
////		System.out.println(height+ "");
////		
////		System.out.println("===================");
////
////		levelOrder(binaryTree);
//
////		System.out.println("===================");
////		int countNodes =countNodes(binaryTree);
////		System.out.println("nodes Count :-> " +countNodes);
////		
////		System.out.println("===================");
////		int sumofNodesDaata =sumofNodesData(binaryTree);
////		System.out.println("sumofNodesDaata :-> " +sumofNodesDaata);
//
////		delete(binaryTree, 2);
////
////		System.out.println("===================");
////
////		levelOrder(binaryTree);
////		
//		searchNode(binaryTree,3);
//
//	}
//
//}
