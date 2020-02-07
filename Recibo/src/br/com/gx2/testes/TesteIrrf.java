package br.com.gx2.testes;

import br.com.gx2.calculo.CalculoIrrf;

public class TesteIrrf {
	
	public static void main(String[] args) {
		
		double servico = 3000.0;
		
		CalculoIrrf irrf = new CalculoIrrf();
		
		System.out.println(irrf.calculaIrrf(servico));
		
		
		
	}

}

