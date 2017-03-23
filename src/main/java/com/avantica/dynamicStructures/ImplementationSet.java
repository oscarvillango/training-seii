package com.avantica.dynamicStructures;

public class ImplementationSet<E> {
	private Node firstElement;	
	
	private class Node{
		private E value;
		private Node next;
	}
	
	public boolean add(E value) {
		
		if(this.contains(value)){
			return false;
		}
		
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
			
			if(cursorNode.value.hashCode() == value.hashCode()){
				return true;
			}
			
			cursorNode = cursorNode.next;
		}
		
		return false;
	}

	public boolean remove(Object value) {
		
		Node pivot = firstElement;
		Node pivotBefore = null;
		
		while(pivot != null){
			if(pivot.value.hashCode() == value.hashCode()){
				
				if(firstElement == pivot){
					firstElement = firstElement.next;
				}else{
					pivotBefore.next = pivot.next;
				}
				
				return true;
			}
			pivotBefore = pivot;
			pivot = pivot.next;
		}
		
		return false;
	}

}
