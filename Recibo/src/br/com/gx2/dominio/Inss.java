package br.com.gx2.dominio;

public class Inss {
	
	private double valorInss;
	
	
	public Inss () {
		
	}


	public Inss(double valorInss) {
		super();
		this.valorInss = valorInss;
	}


	public double getValorInss() {
		return valorInss;
	}


	public void setValorInss(double valorInss) {
		this.valorInss = valorInss;
	}


	@Override
	public String toString() {
		return "Inss [valorInss=" + valorInss + "]";
	}
	
	

}
