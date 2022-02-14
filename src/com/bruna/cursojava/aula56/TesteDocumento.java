package com.bruna.cursojava.aula56;

public class TesteDocumento {

	public static void main(String[] args) {
		//gera um valor aleatório para cpf e cnpj
		/*
		for (TipoDocumento doc : TipoDocumento.values()) {
			
			System.out.println(doc + " - " + doc.geraNumeroTeste());
			
		}*/
		//tem um pouco mais de controle
		//gera um cpf para pessoa fisica
		Pessoa pf = new Pessoa();
		pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
		//gera um cnpj para pessoa juridica
		Pessoa pj = new Pessoa();
		pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
		
		System.out.println(pf);
		System.out.println(pj);

	}

}
