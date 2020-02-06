package br.com.gx2.dominio;

public class PrestadorServico {
	
	private String nomePrestador;
	private String enderecoPrestador;
	private String cpfPrestador;
	private String matriculaPrestador;
	
	public PrestadorServico() {
		
	}

	public PrestadorServico(String nomePrestador, String enderecoPrestador, String cpfPrestador,
			String matriculaPrestador) {
		super();
		this.nomePrestador = nomePrestador;
		this.enderecoPrestador = enderecoPrestador;
		this.cpfPrestador = cpfPrestador;
		this.matriculaPrestador = matriculaPrestador;
	}

	public String getNomePrestador() {
		return nomePrestador;
	}

	public void setNomePrestador(String nomePrestador) {
		this.nomePrestador = nomePrestador;
	}

	public String getEnderecoPrestador() {
		return enderecoPrestador;
	}

	public void setEnderecoPrestador(String enderecoPrestador) {
		this.enderecoPrestador = enderecoPrestador;
	}

	public String getCpfPrestador() {
		return cpfPrestador;
	}

	public void setCpfPrestador(String cpfPrestador) {
		this.cpfPrestador = cpfPrestador;
	}

	public String getMatriculaPrestador() {
		return matriculaPrestador;
	}

	public void setMatriculaPrestador(String matriculaPrestador) {
		this.matriculaPrestador = matriculaPrestador;
	}

	@Override
	public String toString() {
		return "PrestadorServico [nomePrestador=" + nomePrestador + ", enderecoPrestador=" + enderecoPrestador
				+ ", cpfPrestador=" + cpfPrestador + ", matriculaPrestador=" + matriculaPrestador + "]";
	}
	
	

}
