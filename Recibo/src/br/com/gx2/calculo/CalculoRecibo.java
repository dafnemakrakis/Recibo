package br.com.gx2.calculo;

public class CalculoRecibo {
	
	CalculoInss inss = new CalculoInss();
	CalculoIrrf irrf = new CalculoIrrf();
	double servico;
	double valorLiquido;
	
	public double calculaRecibo (double servico) {
		
		valorLiquido = (servico - inss.calculaInss(servico)) - irrf.calculaIrrf(servico);
		
		return valorLiquido;
		
		
	}
	

}
