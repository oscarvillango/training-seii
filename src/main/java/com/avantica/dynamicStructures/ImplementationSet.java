package com.avantica.dynamicStructures;

public class ImplementationSet<E> {
	private Node firstElement;	
	
	private class Node{
		private E value;
		private Node next;
	}
	
	public boolean add(E value) {
		Node oldNode = firstElement;
		Node newNode = new Node();
		
		newNode.value = value;
		firstElement = newNode;
		firstElement.next = oldNode;
		
		return true;
	}

	public boolean contains(Object value) {
		
		Node cursorNode = firstElement;
		
		while(cursorNode != null){
			
			if(cursorNode.value == value){
				return true;
			}
			
			cursorNode = cursorNode.next;
		}
		
		return false;
	}

}
