package com.bruna.cursojava.aula60;

public class EscopoVariaveis {
	
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	//quando declara um parametro é criado uma local dentro do escopo, ai dentro do metodo é feito uma referencia ao parametro e não ao atributo
	public int calculaValor(int valor) {

		valor = valor + 10;
		
		//this.valor = valor; // se tivesse dessa forma iria atribuir ao atributo o valor obtido no método

		return valor;
	}
	//foi criado uma variavel local, então só funciona dentro do escopo do metodo,
	public int teste() {

		int valor = 5;

		if (true) {

			valor--;
		}
		
		//this.valor = valor; referencial valor global/atributo da classe - iria modificar o valor do atributo 

		return valor;
	}
	//como a variavel foi declarada dentro do bloco for, entao a variavel só existe dentro do bloco, por isso vai dar o erro de compilacao
	public void outroTeste() {

		for (int i = 0; i < 10; i++) {//sempre usar chaves mesmo que tenha uma só linha de código
			System.out.println(i);
		}
		
		//i++; //erro de compilação
		//como a variavel foi declarada fora do bloco for, é possivel fazer fora do for referencia a variavel
		int j;
		for (j = 0; j < 10; j++) {
			System.out.println(j);
		}

		System.out.println(j);// j tem valor de 10
	}
	
	public void maisUmTeste() {

		boolean flag = true;

		if (flag) {

			int umaVariavel = 10;

			umaVariavel++;

			System.out.println(umaVariavel);
		}
		//System.out.println(umaVariavel); //dá erro de compilacao, pois a variavel foi declarada dentro do bloco if, portanto ela não existe fora do bloco
	}

	public void maisUmOutroTeste(int num) {

		int total = 0;

		try {
			int outroNum = 0;// só tem escopo dentro do bloco try

			total = num / outroNum;//consegue fazer referencia a variaveis declaradas dentro do metodo tambem

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			total++;
			//outroNum++; //erro de compilação
			//e.printStackTrace(); //erro de compilação

		}

		num++;
		//outroNum++; //erro de compilação
		//e.printStackTrace(); //erro de compilação
	}
}
