package br.com.gx2.testes;

import br.com.gx2.calculo.CalculoRecibo;

public class TesteRecibo {
	
	public static void main(String[] args) {
		double servico = 3000.0;
		
		CalculoRecibo recibo = new CalculoRecibo();
		
		System.out.println(recibo.calculaRecibo(servico));
		
	}
	

	

}
