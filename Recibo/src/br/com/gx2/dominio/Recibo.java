package br.com.gx2.dominio;

public class Recibo {
	
	private double valorServico;
	private double valorLiquido;
	private PrestadorServico prestador;
	private Inss inss;
	private Irrf irrf;
	
	public Recibo () {
		
	}

	public Recibo(double valorServico, double valorLiquido, PrestadorServico prestador, Inss inss, Irrf irrf) {
		super();
		this.valorServico = valorServico;
		this.valorLiquido = valorLiquido;
		this.prestador = prestador;
		this.inss = inss;
		this.irrf = irrf;
	}

	public double getValorServico() {
		return valorServico;
	}

	public void setValorServico(double valorServico) {
		this.valorServico = valorServico;
	}

	public double getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public PrestadorServico getPrestador() {
		return prestador;
	}

	public void setPrestador(PrestadorServico prestador) {
		this.prestador = prestador;
	}

	public Inss getInss() {
		return inss;
	}

	public void setInss(Inss inss) {
		this.inss = inss;
	}

	public Irrf getIrrf() {
		return irrf;
	}

	public void setIrrf(Irrf irrf) {
		this.irrf = irrf;
	}

	@Override
	public String toString() {
		return "Recibo [valorServico=" + valorServico + ", valorLiquido=" + valorLiquido + ", prestador=" + prestador
				+ ", inss=" + inss + ", irrf=" + irrf + "]";
	}
	
	

}
