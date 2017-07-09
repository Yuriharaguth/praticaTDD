package br.com.praticatdd.case_01;

public class Classe_1 {
	public int fibonacci(int n) {
		
		int atual = 0;
		int anterior = 1;
		int anteterior = 0;
		
		for (int i = 1 ; i<=n; i++){
			anteterior = anterior ;
			anterior = atual;
			atual = anterior + anteterior;
		}
		
		return atual;
	}

}
