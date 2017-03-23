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
		ImplementationSet<String> implementationSet = new ImplementationSet<String>();

		Assert.assertTrue(implementationSet.add("Insert value!"));
	}
	
	@Test
	public void verifyAddMoreDataTypesToSet(){
		ImplementationSet<String> implementationSet = new ImplementationSet<String>();

		Assert.assertTrue(implementationSet.add("Insert value!"));
		Assert.assertFalse(implementationSet.add("Insert value!"));
		
		ImplementationSet<Integer> SecondImplementationSet = new ImplementationSet<Integer>();

		Assert.assertTrue(SecondImplementationSet.add(1));
		Assert.assertTrue(SecondImplementationSet.add(2));
		
		ImplementationSet<Person> personImplementationSet = new ImplementationSet<Person>();

		Assert.assertTrue(personImplementationSet.add(new Person("123456", "Oscar", 25)));
		Assert.assertFalse(personImplementationSet.add(new Person("123456", "Oscar", 25)));
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
	
	@Test(expected = IllegalDataType.class)
	public void verifyContainsDifferentDataType(){
		ImplementationSet<String> implementationSet = new ImplementationSet<String>();
		implementationSet.contains(0);
	}
}
