package br.com.gx2.dominio;

public class Irrf {
	
	private double valorIrrf;
	
	public Irrf () {
		
	}

	public Irrf(double valorIrrf) {
		super();
		this.valorIrrf = valorIrrf;
	}

	public double getValorIrrf() {
		return valorIrrf;
	}

	public void setValorIrrf(double valorIrrf) {
		this.valorIrrf = valorIrrf;
	}

	@Override
	public String toString() {
		return "Irrf [valorIrrf=" + valorIrrf + "]";
	}
	
	

}
