package com.avantica.dynamicStructures;

import org.junit.Assert;
import org.junit.Test;

public class DynamicStructuresTest {
	
	@Test
	public void stackTest(){
		Stack stack = new Stack();
		
		stack.push("First value");
		
		Assert.assertTrue(1 == stack.size());
	}
}
