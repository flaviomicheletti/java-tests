package com.example.project;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;


public class ForTest {

	@Test
	public void Example1test() {
		List<String> someList = new ArrayList<String>();
		someList.add("monkey");
		someList.add("donkey");
		someList.add("skeleton key");

		for (String item : someList) {
			assertTrue(someList.contains(item));
		}
	}

	@Test
	public void Example2test() {
		List<String> someList = new ArrayList<String>();
		someList.add("monkey");
		someList.add("donkey");
		someList.add("skeleton key");

		someList.forEach(
			item -> assertTrue(someList.contains(item))
		);
	}
	
	
	/**
	 * https://stackoverflow.com/questions/85190/how-does-the-java-for-each-loop-work
	 */
	@Test
	public void Example3test() {
		List<String> someList = new ArrayList<String>();
		someList.add("monkey");
		someList.add("donkey");
		someList.add("skeleton key");

		// What would the equivalent for loop look like without using the for each syntax?
		
		for (Iterator<String> i = someList.iterator(); i.hasNext();) {
		    String item = i.next();
			assertTrue(someList.contains(item));
		}		
	}
	
}
