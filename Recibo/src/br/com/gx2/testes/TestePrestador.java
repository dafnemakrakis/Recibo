package br.com.gx2.testes;

import br.com.gx2.dominio.PrestadorServico;

public class TestePrestador {
	
	public static void main(String[] args) {
		
		String nomePrestador = "Dáfne";
		String enderecoPrestador = "Rua A";
		String cpfPrestador = "684651321";
		String matriculaPrestador = "6842654168";
		
		PrestadorServico prestador01 = new PrestadorServico (nomePrestador, enderecoPrestador, cpfPrestador, matriculaPrestador);
		
		System.out.println(prestador01);
		
		
	}

}
