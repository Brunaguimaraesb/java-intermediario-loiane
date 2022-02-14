package com.bruna.cursojava.aula56.exercicios;

public enum Operacao {
	
	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {
			return x + y;
		}
	}, SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {
			return x - y;
		}
	}, MULTIPLICAR("*") {
		@Override
		public double executarOperacao(double x, double y) {
			return x * y;
		}
	}, DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			return x / y;
		}
	};

	private String simbolo;

	// construtor que recebe o simbolo da opera��o
	Operacao(String simbolo) {
		this.simbolo = simbolo;
	}

	// implemento do um m�todo abstrato
	public abstract double executarOperacao(double x, double y);

	// m�todo que sobrescreve o m�todo toString que retorna o s�mbolo da opera��o
	public String toString() {
		return this.simbolo;
	}

}
