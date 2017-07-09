package br.com.praticatdd.case_01;

import static org.junit.Assert.*;

import org.junit.Test;

public class Classe_1Test {

	@Test
	public void testFibonacci() {
		Classe_1 c = new Classe_1();
		assertEquals("Case 01", 1, c.fibonacci(1));
		assertEquals("Case 02", 1, c.fibonacci(2));
		assertEquals("Case 03", 2, c.fibonacci(3));
		assertEquals("Case 04", 3, c.fibonacci(4));
		assertEquals("Case 05", 5, c.fibonacci(5));
		assertEquals("Case 06", 8, c.fibonacci(6));
		assertEquals("Case 07", 13, c.fibonacci(7));

		
	}

}
