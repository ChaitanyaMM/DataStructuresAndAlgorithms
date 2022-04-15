package com.datastrctures.hashing;

class DoubleHashingEntry {
	int value;
	int key;

	DoubleHashingEntry(int key,int value){
		this.key=key;
		this.value=value;
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

public class DoubelHasing {
	DoubleHashingEntry doubleHashingEntry[] =null;
	int size = 10;
	int prime = 7;
	
	DoubelHasing(){
		doubleHashingEntry = new DoubleHashingEntry[size];
		for(int i =0 ; i< doubleHashingEntry.length;i++) {
			doubleHashingEntry[i] =null;
		}
		
	}

	int hash(int key) {
		return key % size;
	}

	int primeHash(int key) {
		return prime - (key % prime);
	}

	int doubleHash( int key) {
		int idx = hash(key);
		int i = 0;
		while (doubleHashingEntry[(hash(idx) + i * primeHash(idx)) % size] != null) {
			i++;
		}
		return (idx + i * primeHash(idx)) % size;
	}

	void Insert( int key,int value) {
		int idx = hash(key);
		System.out.println("idx1 :-> " +idx);

		if (doubleHashingEntry[idx] != null) {
			idx = doubleHash(key);
			System.out.println("idx2 :-> " +idx);
//			DoubleHashingEntry entry = doubleHashingEntry[idx];
//			entry.setKey(key);entry.setValue(value);
			 doubleHashingEntry[idx] = new DoubleHashingEntry(key,value);

		}else {
			 doubleHashingEntry[idx] = new DoubleHashingEntry(key,value);
//			entry.setKey(key);
//			entry.setValue(value);
		}
	
	}

	int Search(int key){
	    int idx = hash(key);
	    int i = 0;
	    while (doubleHashingEntry[(hash(idx) + i * primeHash(idx)) % size].getKey() !=key ){
	        i++;
	        if (doubleHashingEntry[(hash(idx) + i * primeHash(idx)) % size].getKey() == 0){
	            return -1;
	        }
	    }
	   int indexLocation= (hash(idx) + i * primeHash(idx)) % size;
	   System.out.println("value :-> " +doubleHashingEntry[indexLocation].getValue());
	    return (hash(idx) + i * primeHash(idx)) % size;
	}
	

	 public void display() {
		 for(int i=0 ;i< doubleHashingEntry.length ;i++ ) {
			 
			 DoubleHashingEntry entry= doubleHashingEntry[i];
			 
			 if(entry!=null) {
				 System.out.println("key -> "+entry.getKey() + " value :-> " +entry.getValue());
	 
			 }
			 
		 }
	 }
	
	
	public static void main(String[] args) {
		DoubelHasing dh = new DoubelHasing();
		dh.Insert(5,30);
		dh.Insert(15, 25);
		dh.Insert(25, 65);
		dh.Insert(35, 75);
		dh.Insert(45, 85);
		dh.display();
		
		dh.Search(45);

	}

}
