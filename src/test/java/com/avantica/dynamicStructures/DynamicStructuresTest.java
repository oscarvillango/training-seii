package com.avantica.dynamicStructures;

import org.junit.Assert;
import org.junit.Test;

public class DynamicStructuresTest {
	
	@Test
	public void stackTest(){
		Stack stack = new Stack();
		
		int limit = 10,
			index = 1;
			
		while(index <= limit){
			stack.push("Element #"+ index + " of the stack");
			index++;
		}

		String stackFirstValue = stack.pop();
		String stackSecondValue = stack.pop();

		//Assert.assertTrue(stack.pop().equalsIgnoreCase(valueToTest));
		Assert.assertFalse(stackFirstValue.equals(stackSecondValue));
	}
}
