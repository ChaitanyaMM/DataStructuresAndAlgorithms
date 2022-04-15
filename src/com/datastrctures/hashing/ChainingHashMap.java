package com.datastrctures.hashing;

import com.datastrctures.hashing.HashTable;

public class ChainingHashMap {

	private static final int size = 100;

	HashTable[] hashtable;

	ChainingHashMap(int size) {

		hashtable = new HashTable[size];

		for (int i = 0; i < size; i++) {
			hashtable[i] = null;
		}
	}

	public int get(int key) {
		int x;
		int hash = key % size;
		if (hashtable[hash] == null)
			return -1;

		else {
			HashTable entry = hashtable[hash];
			while (entry != null && entry.getKey() != key)
				entry = entry.getNext();
			if (entry == null)
				return -1;
			else {
				 x = entry.getValue();
				System.out.println("x value :-> "+x);
			}
				return x;
		}

	}

	public void put(int key, int value) {
		int hash = key % size;

		if (hashtable[hash] == null) {
			hashtable[hash] = new HashTable(key, value);
		} else {

			HashTable entry = hashtable[hash];
			while (entry.getNext() != null && entry.getKey() == key) {
				entry = entry.getNext();

				if (entry.getKey() == key) {
					entry.setValue(value);

				} else {
					entry.setNext(new HashTable(key, value));
				}

			}

		}

	}

	public void remove(int key) {
		int hash = key % size;
		if (hashtable[hash] != null) {
			HashTable prevEntry = null;
			HashTable entry = hashtable[hash];
			while (entry.getNext() != null && entry.getKey() != key) {
				prevEntry = entry;
				entry = entry.getNext();
			}
			if (entry.getKey() == key) {
				if (prevEntry == null) {
					hashtable[hash] = entry.getNext();
				} else {
					prevEntry.setNext(entry.getNext());
				}
			}
		}
	}

	public void display() {
		for (int i = 0; i < hashtable.length; i++) {
			
			HashTable table = hashtable[i];
			  
            while (table != null) {
                System.out.print(table.getValue() + " ");
                table = table.getNext();
            }
		}
	}

	public static void main(String[] args) {
		ChainingHashMap cm = new ChainingHashMap(100);
		cm.put(1, 100);
		cm.put(2, 200);
		cm.put(3, 300);
		cm.put(4, 400);

		cm.display();
		
		cm.get(4);
		
		cm.remove(4);
		
		
		cm.display();

	}

}
