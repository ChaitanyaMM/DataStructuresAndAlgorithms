package com.datastrctures.trie;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
	Map<Character, TrieNode> children;
	boolean endOfWord;

	public TrieNode() {
		children = new HashMap<>();
		endOfWord = false;
	}
}

public class TrieOperations {

	public static TrieNode root;

	public TrieOperations() {
		root = new TrieNode();
	}

	public static void create(String word) {
		root = new TrieNode();
		root.children.put(word.charAt(0), root);
		TrieNode current = root;
		for (int i = 1; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			if (node == null) {
				node = new TrieNode();
				current.children.put(ch, node);
			}
			current = node;

		}
		current.endOfWord = true;

	}

	/**
	 * Iterative implementation of insert into trie
	 */
	public static void insert(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			if (node == null) {
				node = new TrieNode();
				current.children.put(ch, node);
			}
			current = node;
		}
		// mark the current nodes endOfWord as true
		current.endOfWord = true;
	}

	/**
	 * Recursive implementation of insert into trie
	 */
	public static void insertRecursive(String word) {
		insertRecursive(root, word, 0);
	}

	public static void insertRecursive(TrieNode current, String word, int index) {
		if (index == word.length()) {
			// if end of word is reached then mark endOfWord as true on current node
			current.endOfWord = true;
			return;
		}
		char ch = word.charAt(index);
		TrieNode node = current.children.get(ch);

		// if node does not exists in map then create one and put it into map
		if (node == null) {
			node = new TrieNode();
			current.children.put(ch, node);
		}
		insertRecursive(node, word, index + 1);
	}

	/**
	 * Iterative implementation of search into trie.
	 */
	public static boolean search(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = current.children.get(ch);
			// if node does not exist for given char then return false
			if (node == null) {
				return false;
			}
			current = node;
		}
		// return true of current's endOfWord is true else return false.
		return current.endOfWord;
	}

	/**
	 * Recursive implementation of search into trie.
	 */
	public static boolean searchRecursive(String word) {
		return searchRecursive(root, word, 0);
	}

	public static boolean searchRecursive(TrieNode current, String word, int index) {
		if (index == word.length()) {
			// return true of current's endOfWord is true else return false.
			return current.endOfWord;
		}
		char ch = word.charAt(index);
		TrieNode node = current.children.get(ch);
		// if node does not exist for given char then return false
		if (node == null) {
			return false;
		}
		return searchRecursive(node, word, index + 1);
	}

	/**
	 * Delete word from trie.
	 */
	public static void delete(String word) {
		delete(root, word, 0);
	}

	/**
	 * Returns true if parent should delete the mapping
	 */
	public static boolean delete(TrieNode current, String word, int index) {
		if (index == word.length()) {
			// when end of word is reached only delete if currrent.endOfWord is true.
			if (!current.endOfWord) {
				return false;
			}
			current.endOfWord = false;
			// if current has no other mapping then return true
			return current.children.size() == 0;
		}
		char ch = word.charAt(index);
		TrieNode node = current.children.get(ch);
		if (node == null) {
			return false;
		}
		boolean shouldDeleteCurrentNode = delete(node, word, index + 1);

		// if true is returned then delete the mapping of character and trienode
		// reference from map.
		if (shouldDeleteCurrentNode) {
			current.children.remove(ch);
			// return true if no mappings are left in the map.
			return current.children.size() == 0;
		}
		return false;
	}

	public static void main(String[] args) {
		String word1 = "abc";
		String word2 = "abgl";
		String word3 = "cdf";
		String word4 = "abcd";
		String word5 = "lmn";

		create(word1);

 		insert(word2);
		insert(word3);
		insert(word4);
		insert(word5);
		
		boolean result =search(word1);
		System.out.println("result :-> "+ result);

	}

}
