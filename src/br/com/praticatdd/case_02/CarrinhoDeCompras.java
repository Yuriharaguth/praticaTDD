package br.com.praticatdd.case_02;

import java.util.List;

public class CarrinhoDeCompras {

	private List<Produto> produtos;

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void adiciona(Produto produtos){
		this.produtos.add(produtos);
	}
	
	
}
