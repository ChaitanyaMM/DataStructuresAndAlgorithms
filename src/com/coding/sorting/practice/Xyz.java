package com.coding.sorting.practice;


@FunctionalInterface
public interface Xyz {
	
	
	public String hi();
	
	public default String method() {
		return "";
	}

}
