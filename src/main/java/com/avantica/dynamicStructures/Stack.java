package com.avantica.dynamicStructures;

public class Stack {

	private Node firstElement = null;
	private int size = 0;
	
	
	private class Node{
		private String value;
		private Node next;
	}
	
	public Boolean isEmpty() {
		return size == 0;
	}

	public void push(final String string) {
		Node oldNode = firstElement;
		Node newNode = new Node();
		
		newNode.value = string;
		firstElement = newNode;
		firstElement.next = oldNode;
		
		size++;
	}

	public String pop() {
		Node currentNode = firstElement;
		firstElement = firstElement.next;
		
		size--;
		
		return currentNode.value;
	}

	public int size() {
		return size;
	}
	
}
