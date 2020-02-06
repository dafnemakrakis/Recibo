package br.com.gx2.testes;

import br.com.gx2.calculo.CalculoInss;
import br.com.gx2.dominio.Inss;

public class TesteInss {

	public static void main(String[] args) {
	
	double servico = 2500.0;
	
	CalculoInss inss = new CalculoInss();
	
	System.out.println(inss.calculaInss(servico));
		
		
	

	}

}
