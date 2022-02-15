package com.bruna.cursojava.aula61;

//tipos primitivos: passagem por valor
//tipos classe, enum, array: passagem por referência

public class PassagemValorParametro {

	public static void main(String[] args) {
		
		Contato contato = new Contato("Contato 1", "1234-4567", "contato1@email.com"); //é uma instancia de um objeto, tem uma referencia na memoria
		int valor = 10;//tipo primitivo
		
		System.out.println("**valores originais");

		System.out.println(contato);
		System.out.println(valor); //10
		
		System.out.println("**exemplo 1");
		
		//mesmo tendo instanciado um novo contato e atribuindo um novo valor continua apresentando o valor 10 e mesmo nome de contato
		testePassagemValorReferencia(valor, contato); 
		System.out.println(contato);//contato continua como sendo contato 1
		System.out.println(valor);//10
		
		System.out.println("**exemplo 2");
		
		testePassagemValorReferencia2(valor, contato);
		System.out.println(contato);//ao inves de contato1 aparece contato20 no nome
		System.out.println(valor);//valor continua sendo 10
	}
	//atribuiu uma nova instancia para classe contato
	private static void testePassagemValorReferencia(int valor, Contato contato) {

		int novoValor = valor + 10;
		valor = novoValor;

		contato = new Contato("Contato 2", "2345-6789", "contato2@email.com");
	}
	//modifica um atributo da classe atraves do setNome
	private static void testePassagemValorReferencia2(int valor, Contato contato) {

		int novoValor = valor + 10;
		valor = novoValor;

		contato.setNome("Contato" + novoValor);

	}

}
