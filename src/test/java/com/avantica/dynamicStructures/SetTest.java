package com.avantica.dynamicStructures;

import org.junit.Assert;
import org.junit.Test;

public class SetTest {
	@Test
	public void verifySetInstance(){
		ImplementationSet implementationSet = new ImplementationSet();
		
		Assert.assertFalse(implementationSet == null);
	}
	
	@Test
	public void addElementToSet(){
		ImplementationSet implementationSet = new ImplementationSet();
		
		Assert.assertTrue(implementationSet.add("Insert value!"));
	}
}
