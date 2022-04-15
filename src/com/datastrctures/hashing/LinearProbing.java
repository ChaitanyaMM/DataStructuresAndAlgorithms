package com.datastrctures.hashing;

public class LinearProbing {
	int size = 100;

	HashTableEntry[] hashtable = null;

	LinearProbing(int size) { // hashtable creation for size 100
		hashtable = new HashTableEntry[size];
		for (int i = 0; i < size; i++) {
			hashtable[i] = null;
		}
	}

	public void put(int key, int value) {
		int hash = key % size;
		int initialHash = -1;
		while (hash != initialHash && hashtable[hash] != null && hashtable[hash].getKey() != key) {
			if (initialHash == -1)
				initialHash = hash;
			hash = (hash + 1) % size;
		}
		if (hashtable[hash] == null || hash == initialHash)

			hashtable[hash] = new HashTableEntry(key, value);

		else if (initialHash != hash) {

			if (hashtable[hash] != null && hashtable[hash].getKey() == key)

				hashtable[hash].setValue(value);

			else

				hashtable[hash] = new HashTableEntry(key, value);
		}

	}

	public int get(int key) {
		int x;
		int hash = key % size;
		int initialHash = -1;
		while (hashtable[hash] != null && hashtable[hash].getKey() != key) {
			if (initialHash == -1)
				initialHash = hash;
			hash = (hash + 1) % size;
		}
		if (hashtable[hash] == null && hash == initialHash) {
			return -1;
		} else {
			x = hashtable[hash].getValue();
			System.out.println("value :-> " + x);
			return x;
		}

	}

	public void remove(int key) {

		int hash = (key % size);

		int initialHash = -1;

		while (hash != initialHash && hashtable[hash] != null && hashtable[hash].getKey() != key) {

			if (initialHash == -1)

				initialHash = hash;

			hash = (hash + 1) % size;

		}

		if (hash != initialHash && hashtable[hash] != null)

			hashtable[hash] = new HashTableEntry();

	}
	
	
	public void display() {
		
		for(int i =0 ;i < hashtable.length;i++) {
			
			HashTableEntry entry = hashtable[i];
			if(entry !=null) {
				System.out.println(entry.getValue() + " :->"  + entry.getKey() );

			}
			
		}
	}
	
	public static void main(String[] args) {
		//when we decrease size we get index out of bounds bcoz it needs key size
		LinearProbing lp = new LinearProbing(60);
		lp.put(5, 100);
		lp.put(25, 101);
		lp.put(35, 200);
		lp.put(45, 300);
		lp.put(55, 400);
		lp.put(56, 500);
		
		lp.display();
		
	}

}
