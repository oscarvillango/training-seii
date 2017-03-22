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
	
	@Test
	public void verifyAddMoreDataTypesToSet(){
		ImplementationSet<String> implementationSet = new ImplementationSet<String>();
		
		Assert.assertTrue(implementationSet.add("Insert value!"));
		
		ImplementationSet<Integer> SecondImplementationSet = new ImplementationSet<Integer>();

		Assert.assertTrue(SecondImplementationSet.add(1));
	}
	
	@Test
	public void verifyInsertValueAndCheckIfValueExist(){
		ImplementationSet<String> implementationSet = new ImplementationSet<String>();

		Assert.assertTrue(implementationSet.add("Insert value!"));
		Assert.assertTrue(implementationSet.add("Insert value two!"));
		Assert.assertTrue(implementationSet.add("Insert value three!"));
		
		Assert.assertTrue(implementationSet.contains("Insert value!"));
		
		
		Assert.assertFalse(implementationSet.contains("Test Value!"));
	}
}
