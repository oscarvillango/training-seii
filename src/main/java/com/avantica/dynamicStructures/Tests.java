package com.avantica.dynamicStructures;

public class Tests {
public static void main(String[] args) {
	String test1 = "Oscar";
	String test2 = "Oscar";

	System.out.println(test1 == test2);
	
	System.out.println(test1.hashCode());	
	System.out.println(test2.hashCode());
}
}
