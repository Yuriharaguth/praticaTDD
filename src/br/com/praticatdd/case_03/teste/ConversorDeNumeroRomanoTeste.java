package br.com.praticatdd.case_03.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.praticatdd.case_03.ConversorDeNumeroRomano;

public class ConversorDeNumeroRomanoTeste {

	@Test
	public void deveEntenderOSimboloI() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("I");
		assertEquals(1, numero);
	}
	
	@Test
	public void deveEntenderOSimboloV(){
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("V");
		assertEquals(5, numero);
	}
	
	@Test
	public void deveEntenderDoisSimbolosComoII() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("II");
		assertEquals(2, numero);
	}
	
	@Test
	public void deveEntenderQuatroSimbolosDoisADoisComoXXII() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("XXII");
		assertEquals(22, numero);
	}
	
	@Test
	public void deveEntenderNumerosComoIX() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("IX");
		assertEquals(9, numero);
	}
	
	@Test
	public void deveEntenderNumerosComplexosComoXXIV() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("XXIX");
		assertEquals(29, numero);
	}

}
