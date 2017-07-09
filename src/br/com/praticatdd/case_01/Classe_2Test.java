package br.com.praticatdd.case_01;

import static org.junit.Assert.*;

import org.junit.Test;

public class Classe_2Test {

	@Test
	public void test() {
		Classe_2 c = new Classe_2();
		assertEquals("Case 01", 1, c.fatorial(0));
		assertEquals("Case 01", 1, c.fatorial(1));
		assertEquals("Case 01", 2, c.fatorial(2));
	}

}
