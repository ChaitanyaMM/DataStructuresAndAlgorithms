package com.datastrctures.hashing;

public class HashTable {

	private int value;
	private int key;
	private HashTable next;

	HashTable(int key, int value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public HashTable getNext() {
		return next;
	}

	public void setNext(HashTable next) {
		this.next = next;
	}

	int hashCode(int key, int size) {

		return key % size;

	}

}
