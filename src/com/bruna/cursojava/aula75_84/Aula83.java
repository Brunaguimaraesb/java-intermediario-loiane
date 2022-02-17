package com.bruna.cursojava.aula75_84;

//concatenação com StringBuilder e StringBuffer
public class Aula83 {

	public static void main(String[] args) {

		String[] letras = { "B", "C", "D", "E", "F" };

		String alfabeto = "";

		for (String letra : letras) {
			alfabeto += letra;//faz a concatenação mas não é performatico
		}

		System.out.println(alfabeto);//BCDEF

		//utilizando o stringbuffer ele vai criar uma coleção de strings onde podemos adicionar novas strings e chamando o metodo tostring vamos ter uma string unica
		//quando se trabalha com mais de uma thread utiliza o stringbuffer para não dar problema
		StringBuffer sb = new StringBuffer();
		for (String letra : letras) {
			sb.append(letra);//para as strings que quer adicionar
		}

		alfabeto = sb.toString();//para juntar todas as strings

		System.out.println(alfabeto);//BCDEF

		alfabeto = new String(sb);//o proprio construtor da string aceita o stringbuffer
		System.out.println(alfabeto);//BCDEF

		System.out.println(sb.reverse());//FEDCB - reverso da string colocando a string ao contrario
		
		//stringbuilder - o funcionamento é o mesmo do stringbuffer
		StringBuilder sb_ = new StringBuilder();
		for (String letra : letras) {
			sb_.append(letra);
		}

		alfabeto = sb_.toString();

		System.out.println(alfabeto);
	}

}
