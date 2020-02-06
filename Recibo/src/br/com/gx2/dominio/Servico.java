package br.com.gx2.dominio;

public class Servico {
	
	double valorServico;
	
	public Servico() {
		
	}

	public Servico(double valorServico) {
		super();
		this.valorServico = valorServico;
	}

	public double getValorServico() {
		return valorServico;
	}

	public void setValorServico(double valorServico) {
		this.valorServico = valorServico;
	}

	@Override
	public String toString() {
		return "Servico [valorServico=" + valorServico + "]";
	}
	
	

}
