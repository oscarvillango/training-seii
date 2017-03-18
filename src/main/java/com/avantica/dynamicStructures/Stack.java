package com.avantica.dynamicStructures;

public class Stack {

	private String value;
	private int size = 0;
	
	public Boolean isEmpty() {
		return size == 0;
	}

	public void push(final String string) {
		value = string;
		size++;
	}

	public String pop() {
		return value;
	}
	
}
