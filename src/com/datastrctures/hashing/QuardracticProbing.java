package com.datastrctures.hashing;

class QuardracticHashingEntry {
	int value;
	int key;

	QuardracticHashingEntry(int key, int value) {
		this.key = key;
		this.value = value;
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

}

public class QuardracticProbing {
	QuardracticHashingEntry[] quardraticEntry = null;
	int size = 10;
	int prime = 7;

	QuardracticProbing() {
		quardraticEntry = new QuardracticHashingEntry[size];
		for (int i = 0; i < quardraticEntry.length; i++) {
			quardraticEntry[i] = null;
		}

	}

	int hash(int key) {
		return key % size;
	}

	int primeHash(int key) {
		return prime - (key % prime);
	}

	int QuadraticProbe(int key) {
		int idx = hash(key);
		int i = 0;
		while (quardraticEntry[(idx + i * i) % size] != null) {  //hashing function 
			i++;
		}
		return (idx + i * i) % size;
	}

	void Insert( int key,int value){
	    int idx = hash(key);
	 
	    if (quardraticEntry[idx] != null){
	        idx = QuadraticProbe(key);
	    	quardraticEntry[idx] = new QuardracticHashingEntry(key, value);

	    }else {
	    	quardraticEntry[idx] = new QuardracticHashingEntry(key, value);
	    }
	}
	 
	int Search( int key){
	    int idx = hash(key);
	    int i = 0;
	    while (quardraticEntry[(idx+i*i) % size].getKey() != key){
	        i++;
	        if (quardraticEntry[(idx + i*i) % size].getKey() == 0){
	            return -1;
	        }
	    }
	    return (idx + i*i) % size;
	}
	 

	public void display() {
		for (int i = 0; i < quardraticEntry.length; i++) {

			QuardracticHashingEntry entry = quardraticEntry[i];

			if (entry != null) {
				System.out.println("key -> " + entry.getKey() + " value :-> " + entry.getValue() +  " :-> @" + "index" +i);

			}

		}
	}

	public static void main(String[] args) {
		QuardracticProbing qp = new QuardracticProbing();
		qp.Insert(5, 30);
		qp.Insert(15, 25);
		qp.Insert(25, 65);
		qp.Insert(35, 75);
		qp.Insert(45, 85);
		qp.display();

		qp.Search(45);

	}

}
