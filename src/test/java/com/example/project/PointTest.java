package com.example.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {

	@Test
	void test() {
		Point point1 = new Point(0, 0);
		Point point2 = new Point(100, 100);
		Point point3 = point1.center(point2);
		assertEquals("(50,50)", point3.string());
	}

}
