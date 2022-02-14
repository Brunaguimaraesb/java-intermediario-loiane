package com.bruna.cursojava.aula56;

public class Pessoa {
	//gerou o numero teste do documento atraves do proprio enumerador
	private TipoDocumento tipoDocumento;
	private String numeroDocumento;

	public Pessoa() {
		super();
	}

	public Pessoa(TipoDocumento tipoDocumento, String numeroDocumento) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	@Override
	public String toString() {
		return "Pessoa [tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + "]";
	}
	
	

}
