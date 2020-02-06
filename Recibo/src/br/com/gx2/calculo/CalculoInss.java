package br.com.gx2.calculo;

import br.com.gx2.dominio.Servico;

public class CalculoInss {
		
	double descontoInss = 0.0;
	Servico servico01 = new Servico();
	
	public double calculaInss (double servico){
	
	
	 if (servico01.getValorServico() <= 965.67) {
		 descontoInss = servico * 0.08;
         
     }else if(servico01.getValorServico() >= 965.68 & servico01.getValorServico() <= 1609.45){
    	 descontoInss = servico * 0.09;
         
     }else if(servico01.getValorServico() >= 1609.46 & servico01.getValorServico() <= 3218.90){
    	 descontoInss = servico * 0.11;
         
     }else if(servico01.getValorServico() >= 3218.91){
    	 descontoInss = 354.08;
    	          
     }
	 
	 return descontoInss;
	 
	 
	}

}
