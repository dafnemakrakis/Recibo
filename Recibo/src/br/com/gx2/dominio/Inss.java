package br.com.gx2.dominio;

public class Inss {
	
	private double servico;
	private double valorInss;
	
	
	public Inss () {
		
	}


	public Inss(double servico, double valorInss) {
		super();
		this.servico = servico;
		this.valorInss = valorInss;
	}


	public double getServico() {
		return servico;
	}


	public void setServico(double servico) {
		this.servico = servico;
	}


	public double getValorInss() {
		return valorInss;
	}


	public void setValorInss(double valorInss) {
		this.valorInss = valorInss;
	}


	@Override
	public String toString() {
		return "Inss [servico=" + servico + ", valorInss=" + valorInss + "]";
	}

	

	
}
