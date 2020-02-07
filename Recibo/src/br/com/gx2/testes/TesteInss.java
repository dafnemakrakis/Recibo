package br.com.gx2.testes;

import br.com.gx2.calculo.CalculoInss;
import br.com.gx2.dominio.Inss;
import br.com.gx2.dominio.Servico;

public class TesteInss {

	public static void main(String[] args) {
	
	double servico = 3000.0;
	
	CalculoInss inss = new CalculoInss();
	
	
	
	System.out.println(inss.calculaInss(servico));
		
		
	

	}

}
