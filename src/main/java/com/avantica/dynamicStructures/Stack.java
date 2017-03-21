package com.avantica.dynamicStructures;

public class Stack<Item> {

	private Node firstElement = null;
	private int size = 0;
	
	
	private class Node{
		private Item value;
		private Node next;
	}
	
	public Boolean isEmpty() {
		return size == 0;
	}

	public void push(final Item newItem) {
		Node oldNode = firstElement;
		Node newNode = new Node();
		
		newNode.value = newItem;
		firstElement = newNode;
		firstElement.next = oldNode;
		
		size++;
	}

	public Item pop() {
		Node currentNode = firstElement;
		firstElement = firstElement.next;
		
		size--;
		
		return currentNode.value;
	}

	public int size() {
		return size;
	}
	
}
