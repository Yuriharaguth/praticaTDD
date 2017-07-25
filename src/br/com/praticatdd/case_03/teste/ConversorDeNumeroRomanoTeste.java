package br.com.praticatdd.case_03.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.praticatdd.case_03.ConversorDeNumeroRomano;

public class ConversorDeNumeroRomanoTeste {
	
	private ConversorDeNumeroRomano romano;
	
	@Before
	public void inicializa(){
		this.romano = new ConversorDeNumeroRomano();
	}

	@Test
	public void deveEntenderOSimboloI() {
		int numero = romano.converte("I");
		assertEquals(1, numero);
	}
	
	@Test
	public void deveEntenderOSimboloV(){
		int numero = romano.converte("V");
		assertEquals(5, numero);
	}
	
	@Test
	public void deveEntenderDoisSimbolosComoII() {
		int numero = romano.converte("II");
		assertEquals(2, numero);
	}
	
	@Test
	public void deveEntenderQuatroSimbolosDoisADoisComoXXII() {
		int numero = romano.converte("XXII");
		assertEquals(22, numero);
	}
	
	@Test
	public void deveEntenderNumerosComoIX() {
		int numero = romano.converte("IX");
		assertEquals(9, numero);
	}
	
	@Test
	public void deveEntenderNumerosComplexosComoXXIV() {
		int numero = romano.converte("XXIX");
		assertEquals(29, numero);
	}

}
