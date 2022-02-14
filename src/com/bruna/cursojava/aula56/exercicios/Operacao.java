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

	// construtor que recebe o simbolo da operação
	Operacao(String simbolo) {
		this.simbolo = simbolo;
	}

	// implemento do um método abstrato
	public abstract double executarOperacao(double x, double y);

	// método que sobrescreve o método toString que retorna o símbolo da operação
	public String toString() {
		return this.simbolo;
	}

}
