package br.com.praticatdd.case_06;

import java.util.Calendar;

public class GeradorDeNotaFiscal {
	public NotaFiscal gera(Pedido pedido) {
		NotaFiscal nf = new NotaFiscal(
				pedido.getCliente(),
				pedido.getValorTotal() * 0.94,
				Calendar.getInstance());
				new NFDao().persiste(nf);
		return nf;
	}
}
