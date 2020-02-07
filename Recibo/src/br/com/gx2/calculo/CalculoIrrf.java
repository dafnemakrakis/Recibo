package br.com.gx2.calculo;

import br.com.gx2.dominio.Servico;

public class CalculoIrrf {
	
	double irrf = 0.0;
	double parcelaIrrf = 0.0;
	double ir = 0.0;
	
	
	public double calculaIrrf (double servico) {
		
		 if (servico <= 1434.00) {
			 irrf = 0;
			 ir = (irrf + parcelaIrrf);
	            
	        }else if(servico >= 1434.01 & servico <= 2150.00){
	        	irrf = servico * 0.075;
	            parcelaIrrf = 107.55;
	            ir = (irrf + parcelaIrrf);
	            
	        }else if(servico >= 2150.01 & servico <= 2866.00){
	        	irrf = servico * 0.15;
	            parcelaIrrf = 268.80;
	            ir = (irrf + parcelaIrrf);
	            
	        }else if(servico >= 2866.01 & servico <= 3582.00){
	        	irrf = servico * 0.225;
	            parcelaIrrf = 483.75;
	            ir = (irrf + parcelaIrrf);
	            
	        }else if(servico >= 3582.01){
	        	irrf = servico * 0.275;
	            parcelaIrrf = 662.85;
	            ir = (irrf + parcelaIrrf);
	            
	        }
		 
		 return ir;
		
	}

}
