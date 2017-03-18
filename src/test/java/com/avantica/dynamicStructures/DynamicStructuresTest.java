package com.avantica.dynamicStructures;

import org.junit.Assert;
import org.junit.Test;

public class DynamicStructuresTest {
	
	@Test
	public void stackTest(){
		Stack stack = new Stack();
		
		String[] values = {"Test", "for", "Stacks"};
		
		
		int index = 0;
			
		while(index < values.length){
			stack.push(values[index]);
			index++;
		}

		while(0 < index){
			index--;
			Assert.assertTrue(stack.pop().equalsIgnoreCase(values[index]));	
		}
		
	}
}
