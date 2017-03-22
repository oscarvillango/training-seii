package com.avantica.dynamicStructures;

public class ImplementationSet<E> {

	private E value; 
	
	public boolean add(E value) {
		this.value = value;
		return true;
	}

	public boolean contains(Object value) {
		return this.value == value;
	}

}
