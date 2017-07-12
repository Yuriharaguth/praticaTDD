package br.com.praticatdd.case_05;

public class MaiorPreco {

	public double encontra(CarrinhoDeCompras carrinho) {
		double maior = carrinho.getItens().get(0).getValorTotal();
		for(Item item : carrinho.getItens()) {
			if(maior < item.getValorTotal()) {
				maior = item.getValorTotal();
			}
		}
		return maior;
	}
	
}
