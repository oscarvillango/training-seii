package com.avantica.dynamicStructures;

import org.junit.Assert;
import org.junit.Test;

public class DynamicStructuresTest {
	
	@Test
	public void stackTest(){
		Stack stack = new Stack();
		
		String valueToTest = "First value Stack";
		
		stack.push(valueToTest);
		
		Assert.assertTrue(stack.pop().equalsIgnoreCase(valueToTest));
	}
}
