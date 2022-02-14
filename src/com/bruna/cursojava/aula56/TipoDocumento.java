package com.bruna.cursojava.aula56;

public enum TipoDocumento {
	
	CPF {
		@Override
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cpf();
		}
	}, CNPJ {
		@Override
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cnpj();
		}
	};
	//utilizou um metodo abstrato 
	public abstract String geraNumeroTeste();

}
