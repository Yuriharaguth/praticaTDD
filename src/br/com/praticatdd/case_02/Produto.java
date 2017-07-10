package br.com.praticatdd.case_02;

public class Produto {
	
	private int valor;
	private String descricao;

	public Produto( String descricao,int valor) {
		super();
		this.valor = valor;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	
}
