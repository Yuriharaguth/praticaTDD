package br.com.praticatdd.case_06.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.praticatdd.case_06.GeradorDeNotaFiscal;
import br.com.praticatdd.case_06.NotaFiscal;
import br.com.praticatdd.case_06.Pedido;

public class GeradorDeNotaFiscalTeste {

	@Test
	public void deveGerarNFComValorDeImpostoDescontado() {
		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal();
		Pedido pedido = new Pedido("Mauricio", 1000, 1);
		NotaFiscal nf = gerador.gera(pedido);
		assertEquals(1000 * 0.94, nf.getValor(), 0.0001);
	}
}
