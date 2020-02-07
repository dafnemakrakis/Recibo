package br.com.gx2.calculo;

public class CalculoInss {

	double descontoInss = 0.0;

	public double calculaInss(double servico) {

		if (servico <= 965.67) {

			descontoInss = servico * 0.08;

		} else if (servico >= 965.68 & servico <= 1609.45) {
			descontoInss = servico * 0.09;

		} else if (servico >= 1609.46 & servico <= 3218.90) {
			descontoInss = servico * 0.11;

		} else if (servico >= 3218.91) {
			descontoInss = 354.08;

		}

		return descontoInss;

	}

}
