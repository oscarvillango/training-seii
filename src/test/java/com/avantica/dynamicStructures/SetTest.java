package com.avantica.dynamicStructures;

import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class SetTest {
	@Test
	public void verifySetInstance(){
		Set<String> implementationSet = new ImplementationSet<String>();
		
		Assert.assertFalse(implementationSet == null);
	}
}
