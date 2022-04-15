package com.datastrctures.hashing;

public class HashTableEntry {

	int key;
	int value;
	
	HashTableEntry(int key,int value){
		this.key =key;
		this.value=value;
	}

	HashTableEntry(){
		
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

}
