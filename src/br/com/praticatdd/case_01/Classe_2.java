package br.com.praticatdd.case_01;

public class Classe_2 {
	public int fatorial(int n){
		int r = 1;
		for (int t=n; t>=1 ; t--){
			r*=t;
		}
		return r;
	}
}
