package com.avantica.dynamicStructures;

public class Person {
	private String identificationNumber;
	private String name;
	private int age;
	
	public Person(final String identificationNumber, final String name, final int age) {
		this.identificationNumber = identificationNumber;
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificationNumber == null) ? 0 : identificationNumber.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	
}
