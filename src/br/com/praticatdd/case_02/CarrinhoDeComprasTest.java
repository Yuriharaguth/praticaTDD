package br.com.praticatdd.case_02;

import org.junit.Assert;
import org.junit.Test;

public class CarrinhoDeComprasTest {

	@Test
	public void ordemDecrecente(){
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Produto("Geladeira", 450));
		carrinho.adiciona(new Produto("Liquidificador", 250));
		carrinho.adiciona(new Produto("Jogo de pratos", 70));
		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinho);
		Assert.assertEquals("Jogo de pratos",
		algoritmo.getMenor().getDescricao());
		Assert.assertEquals("Geladeira",
		algoritmo.getMaior().getDescricao());
	}

}
