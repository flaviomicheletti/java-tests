package com.example.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EulerTest {

	@Test
	void testExercio01_solucao1() {
		Euler e = new Euler();
		assertEquals(233168, e.exercio01_solucao1());
	}

	@Test
	void testExercio02_solucao2() {
		Euler e = new Euler();
		assertEquals(233168, e.exercio01_solucao2());
	}

}
