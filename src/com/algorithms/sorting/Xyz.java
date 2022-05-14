package com.algorithms.sorting;


@FunctionalInterface
public interface Xyz {
	
	
	public String hi();
	
	public default String method() {
		return "";
	}

}
