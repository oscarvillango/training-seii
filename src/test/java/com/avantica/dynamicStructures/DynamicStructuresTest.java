package com.avantica.dynamicStructures;

import org.junit.Assert;
import org.junit.Test;

public class DynamicStructuresTest {
	
	@Test
	public void stackTest(){
		Stack<Integer> stack = new Stack<Integer>();
		
		int[] values = {1, 2, 5};
		
		
		int index = 0;
			
		while(index < values.length){
			stack.push(values[index]);
			index++;
		}

		while(0 < index){
			index--;
			Assert.assertTrue(stack.pop() == values[index]);	
		}
		
	}
}
