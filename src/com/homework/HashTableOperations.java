package com.homework;

class HashTable {

	int key;
	int value;

	HashTable() {
	}

	HashTable(int key, int value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + key;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashTable other = (HashTable) obj;
		if (key != other.key)
			return false;
		if (value != other.value)
			return false;
		return true;
	}

}

public class HashTableOperations {

	static int size = 10;
	static HashTable[] hashtable = null;

	HashTableOperations() {

	}

	HashTableOperations(int size) {
		hashtable = new HashTable[size];
		for (int i = 0; i < size; i++) {
			hashtable[i] = null;
		}
	}

	public static void put(int key, int value) {

		int hash = key % size;
		int initialHash = -1;
		while (hash != initialHash && hashtable[hash] != null && hashtable[hash].getKey() != key) {
			if (initialHash == -1)
				initialHash = hash;
			hash = (hash + 1) % size;
		}
		if (hashtable[hash] == null || hash == initialHash)

			hashtable[hash] = new HashTable(key, value);

		else if (initialHash != hash) {

			if (hashtable[hash] != null && hashtable[hash].getKey() == key)

				hashtable[hash].setValue(value);

			else

				hashtable[hash] = new HashTable(key, value);
		}

	}

	public static void get(int key) {

		int hash = key % size;
		int initialHash = -1;
		while (hashtable[hash].key != key && hashtable[hash] != null) {
			if (initialHash == -1)
				initialHash = hash;
			hash = (hash + 1) % size;
		}
		if (hashtable[hash] != null && hashtable[hash].key == key) {

			System.out.println(hashtable[hash].getValue());
		}

	}

	public static void remove(int key) {
		int hash = key % size;
		int initialHash = -1;
		while (hash != initialHash && hashtable[hash].key != key && hashtable[hash] != null) {
			if (initialHash == -1) {
				initialHash = hash;
			}
			hash = (hash + 1) % size;
		}

		if (hashtable[hash].key == key && hashtable[hash] != null) {

			hashtable[hash] = new HashTable();

		}

	}

	public static void display(HashTable table) {

	}

	static void main(String[] args) {

		HashTableOperations table = new HashTableOperations();
		table.put(1, 1);

	}

}
