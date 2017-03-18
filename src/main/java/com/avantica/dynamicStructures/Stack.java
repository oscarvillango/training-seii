package com.avantica.dynamicStructures;

public class Stack {

	private String[] value = new String[10];
	private int size = 0;
	
	public Boolean isEmpty() {
		return size == 0;
	}

	public void push(final String string) {
		value[size] = string;
		size++;
	}

	public String pop() {
		return value[--size];
	}

	public int size() {
		return size;
	}
	
}
