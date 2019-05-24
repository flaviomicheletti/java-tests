package com.example.project;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class LinkedListTest {

	@Test
    public void listAdd(){

		List<Integer> list = new LinkedList<>();
		list.add(new Integer(7));
		list.add(new Integer(8));
		list.add(new Integer(9));
		assertEquals(3, list.size());
    }

	@Test
    public void utilIteratorHasNextAndNext(){
		List<String> list = new LinkedList<>();
		list.add("John");
		list.add("Sara");
		list.add("Susan");
		list.add("Betty");
		list.add("Nathan");

		Iterator<String> it = list.iterator();

		assertTrue(it.hasNext());
		assertEquals("John", it.next());

		assertTrue(it.hasNext());
		assertEquals("Sara", it.next());

		assertTrue(it.hasNext());
		assertEquals("Susan", it.next());

		assertTrue(it.hasNext());
		assertEquals("Betty", it.next());

		assertTrue(it.hasNext());
		assertEquals("Nathan", it.next());

		assertFalse(it.hasNext());

    }

	@Test
    public void utilIteratorFor(){
		List<String> list = new LinkedList<>();
		list.add("John");
		list.add("Sara");
		list.add("Susan");
		list.add("Betty");
		list.add("Nathan");

		String s = "";
		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			s += it.next() + " ";
		}
		assertEquals("John Sara Susan Betty Nathan ", s);

	}

	@Test
    public void utilIteratorWhile(){
		List<String> list = new LinkedList<>();
		list.add("John");
		list.add("Sara");
		list.add("Susan");
		list.add("Betty");
		list.add("Nathan");

		Iterator<String> it = list.iterator();
		String s = "";

	    while(it.hasNext()){
			s += it.next() + " ";
	    }
		assertEquals("John Sara Susan Betty Nathan ", s);
	}

}
